package com.example.a07_recyclerviewtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private List<Fruit> fruitList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruits();
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        // LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        // 横向布局
        // layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);

        // 瀑布流布局
        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL);

        recyclerView.setLayoutManager(layoutManager);
        FruitAdapter adapter = new FruitAdapter(fruitList);
        recyclerView.setAdapter(adapter);
    }

    private void initFruits() {
        for (int i = 0; i < 2; i++) {
            // Fruit apple = new Fruit(getRandomLengthName"Apple", R.drawable.ic_launcher_background);
            // fruitList.add(apple);
            // Fruit banana = new Fruit("Banana", R.drawable.ic_launcher_background);
            // fruitList.add(banana);
            // Fruit orange = new Fruit("Orange", R.drawable.ic_launcher_background);
            // fruitList.add(orange);
            // Fruit watermelon = new Fruit("Watermelon", R.drawable.ic_launcher_background);
            // fruitList.add(watermelon);
            // Fruit pear = new Fruit("Pear", R.drawable.ic_launcher_background);
            // fruitList.add(pear);
            // Fruit grape = new Fruit("Grape", R.drawable.ic_launcher_background);
            // fruitList.add(grape);
            // Fruit pineapple = new Fruit("Pineapple", R.drawable.ic_launcher_background);
            // fruitList.add(pineapple);
            // Fruit strawberry = new Fruit("Strawberry", R.drawable.ic_launcher_background);
            // fruitList.add(strawberry);
            // Fruit cherry = new Fruit("Cherry", R.drawable.ic_launcher_background);
            // fruitList.add(cherry);
            // Fruit mango = new Fruit("Mango", R.drawable.ic_launcher_background);
            // fruitList.add(mango);

            Fruit apple = new Fruit(
                    getRandomLengthName("Apple"), R.drawable.ic_launcher_background);
            fruitList.add(apple);
            Fruit banana = new Fruit(
                    getRandomLengthName("Banana"), R.drawable.ic_launcher_background);
            fruitList.add(banana);
            Fruit orange = new Fruit(getRandomLengthName("Orange"), R.drawable.ic_launcher_background);
            fruitList.add(orange);
            Fruit watermelon = new Fruit(getRandomLengthName("Watermelon"), R.drawable.ic_launcher_background);
            fruitList.add(watermelon);
            Fruit pear = new Fruit(
                    getRandomLengthName("Pear"), R.drawable.ic_launcher_background);
            fruitList.add(pear);
            Fruit grape = new Fruit(
                    getRandomLengthName("Grape"), R.drawable.ic_launcher_background);
            fruitList.add(grape);
            Fruit pineapple = new Fruit(getRandomLengthName("Pineapple"), R.drawable.ic_launcher_background);
            fruitList.add(pineapple);
            Fruit strawberry = new Fruit(getRandomLengthName("Strawberry"), R.drawable.ic_launcher_background);
            fruitList.add(strawberry);
            Fruit cherry = new Fruit(
                    getRandomLengthName("Cherry"), R.drawable.ic_launcher_background);
            fruitList.add(cherry);
            Fruit mango = new Fruit(
                    getRandomLengthName("Mango"), R.drawable.ic_launcher_background);
            fruitList.add(mango);
        }
    }

    private String getRandomLengthName(String name) {
        Random random = new Random();
        int length = random.nextInt(20) + 1;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            builder.append(name);
        }
        return builder.toString();
    }
}