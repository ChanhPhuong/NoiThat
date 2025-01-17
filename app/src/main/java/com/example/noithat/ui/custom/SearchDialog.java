package com.example.noithat.ui.custom;

import android.app.Dialog;
import android.content.Context;
import android.view.WindowManager;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.noithat.ui.adapter.ProductAdapter;
import com.example.nongsan.R;
import com.example.noithat.data.remote.entity.Product;

import java.util.List;

public class SearchDialog extends Dialog {
    private List<Product> productList;
    private RecyclerView rcSearchProduct;

    public SearchDialog(@NonNull Context context, List<Product> productList) {
        super(context);
        setContentView(R.layout.search_product);
        getWindow().setLayout(WindowManager.LayoutParams.MATCH_PARENT,
                WindowManager.LayoutParams.MATCH_PARENT);

        this.productList = productList;
        initGUI();
    }

    private void initGUI(){
        rcSearchProduct = findViewById(R.id.rc_search_product);
        ProductAdapter adapter = new ProductAdapter(getContext(), productList);
        rcSearchProduct.setLayoutManager(new GridLayoutManager(getContext(), 2));
        rcSearchProduct.setAdapter(adapter);
    }
}
