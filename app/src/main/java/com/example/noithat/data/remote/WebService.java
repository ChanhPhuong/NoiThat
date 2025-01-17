package com.example.noithat.data.remote;

import com.example.noithat.data.remote.entity.Category;
import com.example.noithat.data.remote.entity.LoginResponse;
import com.example.noithat.data.remote.entity.Product;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface WebService {
    @GET("categories/")
    Call<List<Category>> categoryList();

    @GET("categories/show.php")
    Call<Category> category(@Query("id") int id);

    @GET("products/")
    Call<List<Product>> productList();

    @GET("products/show.php")
    Call<Product> product(@Query("id") int id);

    @GET("products/hot.php")
    Call<List<Product>> hotProducts();

    @GET("products/new.php")
    Call<List<Product>> newProducts();

    @GET("products/lr.php")
    Call<List<Product>> lrProducts();

    @GET("products/bedroom.php")
    Call<List<Product>> bedroomProducts();

    @GET("products/kitchen.php")
    Call<List<Product>> kitchenProducts();

    @GET("products/search.php")
    Call<List<Product>> search(@Query("key") String key);

    /**
     * localhost/api/products/filter.php?categoryId=1
     * @param categoryId
     * @return
     */
    @GET("products/filter.php")
    Call<List<Product>> productListByCategory(@Query("categoryId") int categoryId);

    /**
     * authentication
     */
    @FormUrlEncoded
    @POST("auth/login.php")
    Call<LoginResponse> login(@Field("phone") String phone, @Field("password") String password);
}
