package com.ottugi.curry.web.dto.bookmark;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookmarkRequestDtoTest {

    @Test
    void BookmarkRequestDto_롬복() {

        // given
        Long userId = 1L;
        Long recipeId1 = 1234L;

        // when
        BookmarkRequestDto bookmarkRequestDto = new BookmarkRequestDto(userId, recipeId1);

        // then
        assertEquals(bookmarkRequestDto.getUserId(), userId);
        assertEquals(bookmarkRequestDto.getRecipeId(), recipeId1);
    }
}