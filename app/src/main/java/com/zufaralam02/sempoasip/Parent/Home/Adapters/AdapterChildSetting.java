package com.zufaralam02.sempoasip.Parent.Home.Adapters;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

import com.iapps.adapters.BaseRecyclerAdapter;
import com.zufaralam02.sempoasip.Parent.Home.Models.ListMurid;
import com.zufaralam02.sempoasip.Parent.Home.Models.ModelChildSetting;
import com.zufaralam02.sempoasip.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 16/01/2018.
 */

public class AdapterChildSetting extends BaseRecyclerAdapter {
    public ArrayList<ModelChildSetting> getModelChildSetting1() {
        return modelChildSetting1;
    }

    public void setModelChildSetting1(ArrayList<ModelChildSetting> modelChildSetting1) {
        this.modelChildSetting1 = modelChildSetting1;
    }

    ArrayList<ModelChildSetting> modelChildSetting1;

    public AdapterChildSetting(Context context, List<?> items, int cellLayout) {
        super(context, items, cellLayout);
    }

    @Override
    public RecyclerView.ViewHolder objectHolder(View v) {
        return new AdapterChildSetting.Holder(v);
    }

    @Override
    public RecyclerView.ViewHolder headerHolder(View v) {
        return null;
    }

    @Override
    public void setView(RecyclerView.ViewHolder objectHolder, int position) {

        final AdapterChildSetting.Holder holder = (AdapterChildSetting.Holder) objectHolder;
//        final ModelChildSetting modelChildSetting = (ModelChildSetting) getItem(position);
//        holder.tvNameChildSetting.setText(modelChildSetting.getChildName());
//        holder.tvNumberChildSetting.setText(modelChildSetting.getChildNumber());
//        holder.tvPlaceChildSetting.setText(modelChildSetting.getChildPlace());
//        holder.tvTitlePassChildSetting.setText(modelChildSetting.getChildTitlePass());
//        holder.tvPassChildSetting.setText(modelChildSetting.getChildPass());

        ListMurid listMurid = (ListMurid) getItem(position);

        holder.tvNameChildSetting.setText(listMurid.getNamaSiswa());
        holder.tvNumberChildSetting.setText(listMurid.getKodeSiswa());
        holder.tvPlaceChildSetting.setText(listMurid.getAlamat());
        holder.tvPassChildSetting.setText(listMurid.getMuridAppPwd());

        holder.switchChildSetting.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    holder.tvSwitchChildSetting.setText("Active");
                    holder.tvSwitchChildSetting.setTextColor(Color.parseColor("#fdb17e"));
                    holder.tvNameChildSetting.setTextColor(getContext().getResources().getColor(R.color.text));
                    holder.tvPassChildSetting.setTextColor(getContext().getResources().getColor(R.color.text));
                } else {
                    holder.tvSwitchChildSetting.setText("Deactive");
                    holder.tvSwitchChildSetting.setTextColor(getContext().getResources().getColor(R.color.text_secondary));
                    holder.tvNameChildSetting.setTextColor(getContext().getResources().getColor(R.color.text_secondary));
                    holder.tvPassChildSetting.setTextColor(getContext().getResources().getColor(R.color.text_secondary));
                }
            }
        });
    }

    @Override
    public void setHeaderView(RecyclerView.ViewHolder objectHolder) {

    }

    @Override
    public void itemSelected(int position) {

    }

    private class Holder extends RecyclerView.ViewHolder {
        TextView tvNameChildSetting, tvNumberChildSetting, tvPlaceChildSetting,
                tvTitlePassChildSetting, tvPassChildSetting, tvSwitchChildSetting;
        Switch switchChildSetting;

        public Holder(View v) {
            super(v);

            tvNameChildSetting = v.findViewById(R.id.tvNameChildSetting);
            tvNumberChildSetting = v.findViewById(R.id.tvNumberChildSetting);
            tvPlaceChildSetting = v.findViewById(R.id.tvPlaceChildSetting);
            tvTitlePassChildSetting = v.findViewById(R.id.tvTitlePassChildSetting);
            tvPassChildSetting = v.findViewById(R.id.tvPassChildSetting);
            tvSwitchChildSetting = v.findViewById(R.id.tvSwitchChildSetting);
            switchChildSetting = v.findViewById(R.id.switchChildSetting);
        }
    }
}
