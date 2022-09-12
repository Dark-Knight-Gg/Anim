package com.example.anim_intnetn_grid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class FoodAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Food> listFood;

    public FoodAdapter(Context context, int layout, List<Food> listFood) {
        this.context = context;
        this.layout = layout;
        this.listFood = listFood;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public int getLayout() {
        return layout;
    }

    public void setLayout(int layout) {
        this.layout = layout;
    }

    public List<Food> getListFood() {
        return listFood;
    }

    public void setListFood(List<Food> listFood) {
        this.listFood = listFood;
    }

    @Override
    public int getCount() {
        return listFood.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
    private class ViewHolder{
        ImageView imgPicture;
        TextView txtName,txtPrice;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = new ViewHolder();
        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=inflater.inflate(layout,null);
            //ánh xạ
            holder.imgPicture=convertView.findViewById(R.id.imgPicture);
            holder.txtName= convertView.findViewById(R.id.txtName);
            holder.txtPrice=convertView.findViewById(R.id.txtPrice);
            convertView.setTag(holder);
        }else{
            holder= (ViewHolder) convertView.getTag();
        }
        //gán giá trị
        Food food = listFood.get(position);
        holder.imgPicture.setImageResource(food.getPicture());
        holder.txtName.setText(food.getNameFood());
        holder.txtPrice.setText(food.getPriceFood());
        //gán animation
        Animation anim = AnimationUtils.loadAnimation(context,R.anim.anim_adapter);
        convertView.startAnimation(anim);
        return convertView;
    }
}
