package com.ottugi.curry.domain.lately;

import com.ottugi.curry.domain.recipe.Recipe;
import com.ottugi.curry.domain.user.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class LatelyTest {

    Long userId = 1L;
    String email = "wn8925@sookmyung.ac.kr";
    String nickName = "가경";

    Long recipeId = 1234L;
    String name = "참치마요 덮밥";
    String thumbnail = "www";
    String time = "15분";
    String difficulty = "초급";
    String composition = "든든하게";
    String ingredients = "참치캔###마요네즈###쪽파";
    String seasoning = "진간장###올리고당###설탕###";
    String orders = "1. 기름 뺀 참치###2. 마요네즈 4.5큰 술###3. 잘 비벼주세요.";
    String photo = "www###wwww####wwww";

    @Test
    void 최근본레시피추가() {

        // given
        User user = User.builder().id(userId).email(email).nickName(nickName).build();

        Recipe recipe = Recipe.builder()
                .id(recipeId)
                .name(name)
                .thumbnail(thumbnail)
                .time(time)
                .difficulty(difficulty)
                .composition(composition)
                .ingredients(ingredients)
                .seasoning(seasoning)
                .orders(orders)
                .photo(photo)
                .build();

        Lately lately = new Lately();
        lately.setUser(user);
        lately.setRecipe(recipe);

        // when, then
        assertEquals(lately.getUserId(), user);
        assertEquals(lately.getRecipeId(), recipe);
    }
}