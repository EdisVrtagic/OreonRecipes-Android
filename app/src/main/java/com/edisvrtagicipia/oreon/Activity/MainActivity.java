package com.edisvrtagicipia.oreon.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.edisvrtagicipia.oreon.Activity.Domain.CategoryDomain;
import com.edisvrtagicipia.oreon.Activity.Domain.FoodDomain;
import com.edisvrtagicipia.oreon.Adapter.CategoryAdapter;
import com.edisvrtagicipia.oreon.Adapter.PopularAdapter;
import com.edisvrtagicipia.oreon.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private RecyclerView.Adapter adapter,adapter2;
private RecyclerView recyclerViewCategoryList,recyclerViewPopularList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerViewCategory();
        recyclerViewPopular();
    }

    private void recyclerViewPopular()
    {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerViewPopularList = findViewById(R.id.view2);
        recyclerViewPopularList.setLayoutManager(linearLayoutManager);

        ArrayList<FoodDomain> foodlist = new ArrayList<>();
        foodlist.add(new FoodDomain("Burger 1","burger1","1 tbs peanut oil, 1 kg chicken thigh fillets, 3 tbs curry powder, 1 brown onion diced large, 3 garlic cloves crushed, 2 tbs tomato paste, 2 tbs sugar, 400g coconut cream, 2 cups rice * to serve","10 min"));
        foodlist.add(new FoodDomain("Crispy","crispy","Chicken 400 gm, Salt To Taste, Paprika Powder 1 tsp, Black Pepper powder 1 / 2 tsp, Garlic Powder 1 / 2, Ginger 1 / 2 tsp, Lemon Juice 1 tsp, Egg 2 no, Refind flour 200 gm, Corn Flour 50 gm, Corn Flakes 10 gm, oil For frying","30 min"));
        foodlist.add(new FoodDomain("Steaks","steaks","2 beef steaks, at least 1-inch thick, 2 teaspoons olive oil, 1 teaspoon salt, 1 / 2 teaspoon black pepper, 1 / 2 teaspoon white pepper, 2 tablespoons softened butter, 1 - 2 cloves garlic, minced","30 min"));
        foodlist.add(new FoodDomain("Capricciosa","capricciosa","Artichoke, Slices of Ham, 2 sliced Mushrooms, Black Olives, 1 x Buffalo Mozzarella shredded or diced, 1 glass of Italian tomato sauce for pizza, Basil, A handful of flour","40 min"));
        foodlist.add(new FoodDomain("Margherita","margherita","1kg/4.25 cups Le 5 Stagioni Pizza Napoletana Flour , 600ml / 2.5 cups water(room temperature), 2g / 0.03oz fresh yeast, 30g / 2 tablespoons sea salt, 1 x tin(400 grams - 14 oz) San Marzano Tomatoes, Fresh Basil, Handful pecorino romano cheese, 100g / 3.53oz Fior di latte Mozzarella, Salt, Extra virgin olive oil","30 min"));
        foodlist.add(new FoodDomain("Funghi","funghi","1 cup of warm water , 1 tsp active dry yeast, 1 tsp sugar, 5 tbsp olive oil, 1 / 2 tsp salt, 2 cups all - purpose flour, 3 tbsp minced garlic, Salt & pepper to taste, 200g mushrooms, 200g mozzarella cheese, Pizza sauce","20 min"));
        foodlist.add(new FoodDomain("Toast","toast","(grind smooth), 1 cup boiled chickpea, 2 tbsp sesame paste / tahini, 2 - 3 garlic cloves, 1 tsp lemon juice, 2 tbsp olive oil, 1 / 2 tsp cumin powder, Salt as per taste, Other ingredients:, 2 slices of toasted bread, 2 tbsp grated carrot, 2 tbsp sprouts, Bell pepper slices, Cucumber slices, Onion slices, Lettuce leaves, Cherry Tomato slices, Salt and pepper as per taste","7 min"));
        foodlist.add(new FoodDomain("Enchiladas","enchiladas","2 cups enchilada sauc, 2 tbsp olive oil, 1 cup red onions chopped, 1 red bell pepper chopped, 1 tsp ground cumin, 4 cups baby spinach approx. 4 heaping handfuls, 1 15 oz can black beans rinsed, drained, 1 cup Monterey Jack cheese shredded, ½ cup corn I used frozen, salt and pepper to taste, 6 - 8 whole wheat tortillas 8” diameter, chopped cilantro for garnish","20 min"));
        foodlist.add(new FoodDomain("Zucchini Pasta","zucchini","3 Tablespoon Olive Oil, 130g / 1 + 1 / 4 cup approx.Onion - Thinly Sliced, 3 to 4 garlic cloves / 1 Tablespoon approx.Garlic - finely chopped, 1 / 4 to 1 / 2 Teaspoon Chili Flakes or to taste, 2 + 1 / 2 Tablespoon Tomato Paste, (If you like your pasta more zesty, slightly increase the quantity of the tomato paste), 350g / 3 Cups approx.Zucchini - Cut in 1 / 2 inch semi circle pieces, 3 / 4 Cup Pasta Cooking Water OR AS REQUIRED, 200g / 1 + 1 / 4 Cup approx.Cherry or Grape Tomatoes, Salt to taste(I have added total 1 / 4 + 1 / 2 Teaspoon of pink himalayan salt), Drizzle of Olive Oil(I added 1 tablespoon of organic cold pressed Olive Oil), 1 / 2 Teaspoon Freshly Ground Black Pepper or to taste, 12g / 1 / 2 Cup Fresh Basil or to taste","12 min"));
        foodlist.add(new FoodDomain("Ube Cheesecake","ubecheesecake","Graham Cracker Crust:, 2 cups graham cracker crumbs[225 g], 5 tbsp unsalted butter[71 g], 2 tbsp granulated sugar[24 g], 1 tsp vanilla extract[5 mL], Ube Cheesecake Filling:, 3 bars of full - fat cream cheese, 8 oz each(total of 24 oz)[680 g], 1 cup granulated sugar[200 g], 1 / 4 cup ube halaya[60 mL], 2 cups full - fat sour cream(16 oz)[453 g], 1 tbsp ube extract[15 mL], 2 tbsp all - purpose flour[15.6 g], 3 large eggs[150 g without shell], Coconut Whipped Cream:, 2 cups heavy cream[480 mL], 1 / 2 cup cold coconut cream(separated from 13.5 oz can)[120 mL], 1 / 4 cup granulated sugar[50 g], 1 tsp vanilla extract[5 mL]","1 hour"));
        foodlist.add(new FoodDomain("Funfetti Cake","funfetti","120 grams (4 ounces) Canola Oil, 200 grams(7 ounces) Buttermilk, 1 teaspoon Butter Extract, 5 teaspoons Clear Vanilla Extract, 200 grams(7 ounces) Egg Whites, 2 large Eggs, 600 grams(21 ounces) Sugar, 520 grams(18 ounces) Cake Flour, 5 teaspoons Baking Powder, 1 / 2 teaspoon Xanthan Gum, 1 / 2 teaspoon Soy Lecithin, 1 teaspoon Salt, 120 grams(4 ounces) Shortening, 120 grams(4 ounces) Unsalted Butter(room temperature)","1 hour"));
        foodlist.add(new FoodDomain("Pistachio Cake","pistachio","Crust 9 inch Baking Pan, 300g Digestive biscuits, 1 / 4 Cup melted butter, Filling, 1 / 2 Heavy cream, 500g Cream cheese, 1 / 2 Cup icing sugar, 1tsp Vanilla extract, 2 tbsp Lemon, 1 / 2 Cup ground pistachio(to mix with cake batter), 1tsp gelatin, 1 / 8 Cup hot water(to mix with gelatin), 1 / 4 Cup Ground pistachio sprinkled(centre of cake), 1 / 3 cup chopped unshelled pistachio(circumference of cake), 2 Mint leaves for centre piece","1 hour"));
        foodlist.add(new FoodDomain("Loaded Brocoli","brocolisalad","The other ingredients that I used to make this easy dish:, - Craisins(I used the 50 % less sugar variety because they are sweet enough without all the sugar),  - Kroger walnuts,  - Kroger Fully - cooked bacon(you could cook your own, but this just saves you additional work and time),  - Kroger sharp cheddar cheese,  - Gala apple,  - Red onion","7 min"));
        foodlist.add(new FoodDomain("Cucumber","cucumber","4 cucumbers, 1 onion, 1 cup vinegar, 1 cup water, 1 teaspoon dill weed, 1 teaspoon Sugar, 1 / 2 fresh squeezed lemon juice, 1 / 2 teaspoon salt, 1 / 2 teaspoon pepper","5 min"));
        foodlist.add(new FoodDomain("White Bean","veggiesal","2 cans white beans (cannellini), drained and rinsed well, 1 English cucumber, diced, 10 oz grape or cherry tomatoes, halved, 4 green onions, chopped, 1 cup chopped fresh parsley, 15 to 20 mint leaves, chopped, 1 lemon, zested and juiced, Salt and pepper, 1 tsp za’atar, more if you like, ½ tsp each sumac and Aleppo pepper, Extra virgin olive oil(Early Harvest), Feta cheese, optional","10 min"));
        adapter2 = new PopularAdapter(foodlist);
        recyclerViewPopularList.setAdapter(adapter2);
    }

    private void recyclerViewCategory()
    {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerViewCategoryList = findViewById(R.id.view1);
        recyclerViewCategoryList.setLayoutManager(linearLayoutManager);
        ArrayList<CategoryDomain> categoryList = new ArrayList<>();
        categoryList.add(new CategoryDomain("Pizza","cat_1"));
        categoryList.add(new CategoryDomain("Meat","cat_2"));
        categoryList.add(new CategoryDomain("Vegan","cat_3"));
        categoryList.add(new CategoryDomain("Cakes","cat_4"));
        categoryList.add(new CategoryDomain("Salads","cat_5"));
        adapter = new CategoryAdapter(categoryList);
        recyclerViewCategoryList.setAdapter(adapter);
    }
}