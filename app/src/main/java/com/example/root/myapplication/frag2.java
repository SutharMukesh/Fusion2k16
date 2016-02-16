package com.example.root.myapplication;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

/**
 * Created by root on 7/2/16.
 */
public class frag2 extends android.support.v4.app.ListFragment implements AdapterView.OnItemClickListener {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragtest2,container,false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        String [] fraglist={"Sketch the Lyrics","Rubix Cube","Box Cricket","Rink Football","Rangoli","Apharan","Beg N Borrow","Striker","Lazer maze","Pic Hunter","Bathroom Singer","60 Sec to Fame","Bakasur","Masterchef PVPP","Rattamaar","Lan Gaming","Unused"};
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,fraglist);
        setListAdapter(adapter);
        getListView().setOnItemClickListener(this);
    }
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if( position==0)
        {
            Intent i=new Intent(this.getActivity(),Sketch.class);
            startActivity(i);
        }
        else if(position==1)
        {
            Intent i=new Intent(this.getActivity(),Rubix.class);
            startActivity(i);
        }
        else if(position==2)
        {
            Intent i=new Intent(this.getActivity(),Boxcric.class);
            startActivity(i);
        } else if(position==3)
        {
            Intent i=new Intent(this.getActivity(),Rink.class);
            startActivity(i);
        } else if(position==4)
        {
            Intent i=new Intent(this.getActivity(),Rangoli.class);
            startActivity(i);
        } else if(position==5)
        {
            Intent i=new Intent(this.getActivity(),Apahran.class);
            startActivity(i);
        } else if(position==6)
        {
            Intent i=new Intent(this.getActivity(),Beg.class);
            startActivity(i);
        } else if(position==7)
        {
            Intent i=new Intent(this.getActivity(),Striker.class);
            startActivity(i);
        } else if(position==8)
        {
            Intent i=new Intent(this.getActivity(),Lazer.class);
            startActivity(i);
        } else if(position==9)
        {
            Intent i=new Intent(this.getActivity(),PicHunt.class);
            startActivity(i);
        }
        else if(position==10)
        {
            Intent i=new Intent(this.getActivity(),Bathroom.class);
            startActivity(i);
        }
        else if(position==11)
        {
            Intent i=new Intent(this.getActivity(),Sixty.class);
            startActivity(i);
        }
        else if(position==12)
        {
            Intent i=new Intent(this.getActivity(),Bakasur.class);
            startActivity(i);
        }
        else if(position==13)
        {
            Intent i=new Intent(this.getActivity(),Masterchef.class);
            startActivity(i);
        }
        else if(position==14)
        {
            Intent i=new Intent(this.getActivity(),Ratta.class);
            startActivity(i);
        }
        else if(position==15)
        {
            Intent i=new Intent(this.getActivity(),Langame.class);
            startActivity(i);
        }
    }
}
