package com.example.idamahmudah.scheduletry;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.idamahmudah.scheduletry.Model.DataModel;
import com.example.idamahmudah.scheduletry.Model.ScheduleModel;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private FirebaseDatabase dB;
    private DatabaseReference dBRef;
    private DatabaseReference dBRef2;

    private List<DataModel> mDataList;
    private RecyclerView mRecyclerView;
    private UserAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dB = FirebaseDatabase.getInstance();
        dBRef = dB.getReference("tb_user");
        dBRef2 = dB.getReference("tb_schedule");
//
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
//        mAdapter = new UserAdapter(MainActivity.this, mDataList);
//        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
//        mRecyclerView.setLayoutManager(layoutManager);
//        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
//        mRecyclerView.setAdapter(mAdapter);

        mDataList = new ArrayList<>();

//        dBRef.addChildEventListener(new ChildEventListener() {
//            @Override
//            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
////                DataModel dataUser = dataSnapshot.getValue(DataModel.class);
//
//                for(DataSnapshot userSnapshot: dataSnapshot.getChildren()){
//                    DataModel dataUser = userSnapshot.getValue(DataModel.class);
//                    mDataList.add(dataUser);
//
//                    System.out.println("ID: " +dataUser.getId_user());
//                    System.out.println("Name: " +dataUser.getName());
//                    System.out.println("NIM: " +dataUser.getNim());
//                }
//
////                mDataList.add(dataUser);
//                mAdapter.notifyDataSetChanged();
//            }
//
//            @Override
//            public void onChildChanged(DataSnapshot dataSnapshot, String s) {
//
//            }
//
//            @Override
//            public void onChildRemoved(DataSnapshot dataSnapshot) {
//
//            }
//
//            @Override
//            public void onChildMoved(DataSnapshot dataSnapshot, String s) {
//
//            }
//
//            @Override
//            public void onCancelled(DatabaseError databaseError) {
//
//            }
//        });



//        dBRef.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(DataSnapshot dataSnapshot) {
////                DataModel dataUser = dataSnapshot.getValue(DataModel.class);
////                System.out.println("ID: " +dataUser.getId_user());
////                System.out.println("Name: " +dataUser.getName());
////                System.out.println("NIM: " +dataUser.getNim());
//
//                for(DataSnapshot userSnapshot: dataSnapshot.getChildren()){
//                    DataModel dataUser = userSnapshot.getValue(DataModel.class);
//                    mDataList.add(dataUser);
//
//                    System.out.println("ID: " +dataUser.getId_user());
//                    System.out.println("Name: " +dataUser.getName());
//                    System.out.println("NIM: " +dataUser.getNim());
//                }
//                mAdapter.notifyDataSetChanged();
//            }
//
//            @Override
//            public void onCancelled(DatabaseError databaseError) {
//
//            }
//        });

        dBRef2.child("user_id_3").child("course_id_1").child("schedule_id_1").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                ScheduleModel dataSchedule = dataSnapshot.getValue(ScheduleModel.class);
                System.out.println("Schedule ID: " +dataSchedule.getSchedule_id());
                System.out.println("Class Location: " +dataSchedule.getClass_location());
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        dBRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
//                DataModel dataUser = dataSnapshot.getValue(DataModel.class);
//                System.out.println("ID: " +dataUser.getId_user());
//                System.out.println("Name: " +dataUser.getName());
//                System.out.println("NIM: " +dataUser.getNim());

                for(DataSnapshot userSnapshot: dataSnapshot.getChildren()){
                    DataModel dataUser = userSnapshot.getValue(DataModel.class);
                    mDataList.add(dataUser);

                    System.out.println("ID: " +dataUser.getId_user());
                    System.out.println("Name: " +dataUser.getName());
                    System.out.println("NIM: " +dataUser.getNim());
                }
//                mAdapter.notifyDataSetChanged();

                mAdapter = new UserAdapter(MainActivity.this, mDataList);
                RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
                mRecyclerView.setLayoutManager(layoutManager);
                mRecyclerView.setItemAnimator(new DefaultItemAnimator());
                mRecyclerView.setAdapter(mAdapter);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }

    public void userData(){
//        dBRef.addChildEventListener(new ChildEventListener() {
//            @Override
//            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
//                DataModel dataUser = dataSnapshot.getValue(DataModel.class);
//                System.out.println("ID: " +dataUser.getId_user());
//                System.out.println("Name: " +dataUser.getName());
//                System.out.println("NIM: " +dataUser.getNim());
//
//                mDataList.add(dataUser);
//                mAdapter.notifyDataSetChanged();
//            }
//
//            @Override
//            public void onChildChanged(DataSnapshot dataSnapshot, String s) {
//
//            }
//
//            @Override
//            public void onChildRemoved(DataSnapshot dataSnapshot) {
//
//            }
//
//            @Override
//            public void onChildMoved(DataSnapshot dataSnapshot, String s) {
//
//            }
//
//            @Override
//            public void onCancelled(DatabaseError databaseError) {
//
//            }
//        });


//        dBRef.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(DataSnapshot dataSnapshot) {
//                DataModel dataUser = dataSnapshot.getValue(DataModel.class);
//                System.out.println("ID: " +dataUser.getId_user());
//                System.out.println("Name: " +dataUser.getName());
//                System.out.println("NIM: " +dataUser.getNim());
//
//                mDataList.add(dataUser);
//                mAdapter.notifyDataSetChanged();
//            }
//
//            @Override
//            public void onCancelled(DatabaseError databaseError) {
//
//            }
//        });
    }
}
