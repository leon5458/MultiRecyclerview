package com.hly.multirecyclerview;

import android.content.Context;

import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

/**
 * ~~~~~~文件描述:~~~~~~
 * ~~~~~~作者:huleiyang~~~~~~
 * ~~~~~~创建时间:2019/4/3~~~~~~
 * ~~~~~~更改时间:2019/4/3~~~~~~
 * ~~~~~~版本号:2.0~~~~~~
 */
public class MultipleItemQuickAdapter extends BaseMultiItemQuickAdapter<MultipleItem, BaseViewHolder>{

    public MultipleItemQuickAdapter(Context context, List data) {
        super(data);
        addItemType(MultipleItem.TEXT, R.layout.item_text_view);
        addItemType(MultipleItem.IMG, R.layout.item_image_view);
        addItemType(MultipleItem.IMG_TEXT, R.layout.item_img_text_view);
    }

    @Override
    protected void convert(BaseViewHolder helper, MultipleItem item) {
        switch (helper.getItemViewType()){
            case MultipleItem.TEXT:

                break;
             case MultipleItem.IMG:

                 break;
            case MultipleItem.IMG_TEXT:

                break;
        }
    }

}
