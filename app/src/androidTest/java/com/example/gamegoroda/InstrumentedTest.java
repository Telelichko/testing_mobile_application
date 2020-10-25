package com.example.gamegoroda;

import android.app.Instrumentation;
import android.support.test.InstrumentationRegistry;
import android.content.Context;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class InstrumentedTest {

    @Parameterized.Parameter(value = 0)
    public String word;

    @Parameterized.Parameter(value = 1)
    public String lSymb;

    @Parameterized.Parameter(value = 2)
    public String pastText;

    @Parameterized.Parameter(value = 3)
    public String theme;

    @Parameterized.Parameter(value = 4)
    public int k;

    public Context context = InstrumentationRegistry.getTargetContext();


//    (String word, String lSymb, String pastText, String theme, int k, Context ctx)


    @Parameterized.Parameters
    public static Collection<Object[]> initParameters() {
        return Arrays.asList(new Object[][] {
                { "Рио-де-Жанейро", "О", "Введите слово", "towns", 29 },
                { "Рио-де-Жанейро", "О", "Введите слово", "towns", 29 }});


    }

    @Test
    public void test_confirm_word()
    {

        Data data = new Data();
        System.out.print(word);
        System.out.print("LSDJFkfrgjjodfgfdkgjdfo");
        String something = data.confirmWord(word, lSymb, pastText, theme, k, context);
        System.out.print(something);
        Assert.assertNotNull("SDKfjfjkdghfghfg", something);
    }

    @Test
    public void test_confirm_word333()
    {

        Data data = new Data();
        System.out.print(word);
        String something = data.confirmWord(word, lSymb, pastText, theme, k, context);
        System.out.print(something);
        Assert.assertEquals("SDKfjfjkdghfghfg",
                "IAmWin", something);
    }

    @Test
    public void test1_2()
    { Context context = InstrumentationRegistry.getTargetContext();
        Data data = new Data();
        Assert.assertNotNull(data.confirmWord("Великий Устюг", "Г", "Введите слово", "towns", 29, context));
    }


}
