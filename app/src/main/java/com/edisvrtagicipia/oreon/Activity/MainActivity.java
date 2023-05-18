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
        foodlist.add(new FoodDomain("Burger 1","burger1","1 tbs peanut oil\n1 kg chicken thigh fillets\n3 tbs curry powder\n1 brown onion diced large\n3 garlic cloves crushed\n2 tbs tomato paste\n2 tbs sugar\n400g coconut cream\n2 cups rice * to serve","10 min"));
        foodlist.add(new FoodDomain("Crispy","crispy","Chicken 400 gm\nSalt To Taste\nPaprika Powder 1 tsp\nBlack Pepper powder 1 / 2 tsp\nGarlic Powder 1 / 2\nGinger 1 / 2 tsp\nLemon Juice 1 tsp\nEgg 2 no\nRefind flour 200 gm\nCorn Flour 50 gm\nCorn Flakes 10 gm\noil For frying","30 min"));
        foodlist.add(new FoodDomain("Steaks","steaks","2 beef steaks\nat least 1-inch thick\n2 teaspoons olive oil\n1 teaspoon salt\n1 / 2 teaspoon black pepper\n1 / 2 teaspoon white pepper\n2 tablespoons softened butter\n1 - 2 cloves garlic\nminced","30 min"));
        foodlist.add(new FoodDomain("Capricciosa","capricciosa","Artichoke\nSlices of Ham\n2 sliced Mushrooms\nBlack Olives\n1 x Buffalo Mozzarella shredded or diced\n1 glass of Italian tomato sauce for pizza\nBasil\nA handful of flour","40 min"));
        foodlist.add(new FoodDomain("Margherita","margherita","1kg/4.25 cups Le 5 Stagioni Pizza Napoletana Flour \n600ml / 2.5 cups water(room temperature)\n2g / 0.03oz fresh yeast\n30g / 2 tablespoons sea salt\n1 x tin(400 grams - 14 oz) San Marzano Tomatoes\nFresh Basil\nHandful pecorino romano cheese\n100g / 3.53oz Fior di latte Mozzarella\nSalt\nExtra virgin olive oil","30 min"));
        foodlist.add(new FoodDomain("Funghi","funghi","1 cup of warm water \n1 tsp active dry yeast\n1 tsp sugar\n5 tbsp olive oil\n1 / 2 tsp salt\n2 cups all - purpose flour\n3 tbsp minced garlic\nSalt & pepper to taste\n200g mushrooms\n200g mozzarella cheese\nPizza sauce","20 min"));
        foodlist.add(new FoodDomain("Toast","toast","(grind smooth)\n1 cup boiled chickpea\n2 tbsp sesame paste / tahini\n2 - 3 garlic cloves\n1 tsp lemon juice\n2 tbsp olive oil\n1 / 2 tsp cumin powder\nSalt as per taste\nOther ingredients:\n2 slices of toasted bread\n2 tbsp grated carrot\n2 tbsp sprouts\nBell pepper slices\nCucumber slices\nOnion slices\nLettuce leaves\nCherry Tomato slices\nSalt and pepper as per taste","7 min"));
        foodlist.add(new FoodDomain("Enchiladas","enchiladas","2 cups enchilada sauc\n2 tbsp olive oil\n1 cup red onions chopped\n1 red bell pepper chopped\n1 tsp ground cumin\n4 cups baby spinach approx. 4 heaping handfuls\n1 15 oz can black beans rinsed\ndrained\n1 cup Monterey Jack cheese shredded\n½ cup corn I used frozen\nsalt and pepper to taste\n6 - 8 whole wheat tortillas 8” diameter\nchopped cilantro for garnish","20 min"));
        foodlist.add(new FoodDomain("Zucchini Pasta","zucchini","3 Tablespoon Olive Oil\n130g / 1 + 1 / 4 cup approx.Onion - Thinly Sliced\n3 to 4 garlic cloves / 1 Tablespoon approx.Garlic - finely chopped\n1 / 4 to 1 / 2 Teaspoon Chili Flakes or to taste\n2 + 1 / 2 Tablespoon Tomato Paste\n(If you like your pasta more zesty\nslightly increase the quantity of the tomato paste)\n350g / 3 Cups approx.Zucchini - Cut in 1 / 2 inch semi circle pieces\n3 / 4 Cup Pasta Cooking Water OR AS REQUIRED\n200g / 1 + 1 / 4 Cup approx.Cherry or Grape Tomatoes\nSalt to taste(I have added total 1 / 4 + 1 / 2 Teaspoon of pink himalayan salt)\nDrizzle of Olive Oil(I added 1 tablespoon of organic cold pressed Olive Oil)\n1 / 2 Teaspoon Freshly Ground Black Pepper or to taste\n12g / 1 / 2 Cup Fresh Basil or to taste","12 min"));
        foodlist.add(new FoodDomain("Ube Cheesecake","ubecheesecake","Graham Cracker Crust:\n2 cups graham cracker crumbs[225 g]\n5 tbsp unsalted butter[71 g]\n2 tbsp granulated sugar[24 g]\n1 tsp vanilla extract[5 mL]\nUbe Cheesecake Filling:\n3 bars of full - fat cream cheese\n8 oz each(total of 24 oz)[680 g]\n1 cup granulated sugar[200 g]\n1 / 4 cup ube halaya[60 mL]\n2 cups full - fat sour cream(16 oz)[453 g]\n1 tbsp ube extract[15 mL]\n2 tbsp all - purpose flour[15.6 g]\n3 large eggs[150 g without shell]\nCoconut Whipped Cream:\n2 cups heavy cream[480 mL]\n1 / 2 cup cold coconut cream(separated from 13.5 oz can)[120 mL]\n1 / 4 cup granulated sugar[50 g]\n1 tsp vanilla extract[5 mL]","1 hour"));
        foodlist.add(new FoodDomain("Funfetti Cake","funfetti","120 grams (4 ounces) Canola Oil\n200 grams(7 ounces) Buttermilk\n1 teaspoon Butter Extract\n5 teaspoons Clear Vanilla Extract\n200 grams(7 ounces) Egg Whites\n2 large Eggs\n600 grams(21 ounces) Sugar\n520 grams(18 ounces) Cake Flour\n5 teaspoons Baking Powder\n1 / 2 teaspoon Xanthan Gum\n1 / 2 teaspoon Soy Lecithin\n1 teaspoon Salt\n120 grams(4 ounces) Shortening\n120 grams(4 ounces) Unsalted Butter(room temperature)","1 hour"));
        foodlist.add(new FoodDomain("Pistachio Cake","pistachio","Crust 9 inch Baking Pan\n300g Digestive biscuits\n1 / 4 Cup melted butter\nFilling\n1 / 2 Heavy cream\n500g Cream cheese\n1 / 2 Cup icing sugar\n1tsp Vanilla extract\n2 tbsp Lemon\n1 / 2 Cup ground pistachio(to mix with cake batter)\n1tsp gelatin\n1 / 8 Cup hot water(to mix with gelatin)\n1 / 4 Cup Ground pistachio sprinkled(centre of cake)\n1 / 3 cup chopped unshelled pistachio(circumference of cake)\n2 Mint leaves for centre piece","1 hour"));
        foodlist.add(new FoodDomain("Loaded Brocoli","brocolisalad","The other ingredients that I used to make this easy dish:\n- Craisins(I used the 50 % less sugar variety because they are sweet enough without all the sugar)\n - Kroger walnuts\n - Kroger Fully - cooked bacon(you could cook your own\nbut this just saves you additional work and time)\n - Kroger sharp cheddar cheese\n - Gala apple\n - Red onion","7 min"));
        foodlist.add(new FoodDomain("Cucumber","cucumber","4 cucumbers\n1 onion\n1 cup vinegar\n1 cup water\n1 teaspoon dill weed\n1 teaspoon Sugar\n1 / 2 fresh squeezed lemon juice\n1 / 2 teaspoon salt\n1 / 2 teaspoon pepper","5 min"));
        foodlist.add(new FoodDomain("White Bean","veggiesal","2 cans white beans (cannellini)\ndrained and rinsed well\n1 English cucumber\ndiced\n10 oz grape or cherry tomatoes\nhalved\n4 green onions\nchopped\n1 cup chopped fresh parsley\n15 to 20 mint leaves\nchopped\n1 lemon\nzested and juiced\nSalt and pepper\n1 tsp za’atar\nmore if you like\n½ tsp each sumac and Aleppo pepper\nExtra virgin olive oil(Early Harvest)\nFeta cheese\noptional","10 min"));
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
