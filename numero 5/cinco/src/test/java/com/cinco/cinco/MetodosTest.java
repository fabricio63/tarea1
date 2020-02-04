package com.cinco.cinco;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MetodosTest {

    @Test
    void counter2() {
        assertEquals("\n* e = 47  ***********************************************\n" +
                "* t = 44  ********************************************\n" +
                "* s = 42  ******************************************\n" +
                "* i = 40  ****************************************\n" +
                "* a = 37  *************************************\n" +
                "* u = 31  *******************************\n" +
                "* n = 21  *********************\n" +
                "* r = 21  *********************\n" +
                "* m = 17  *****************\n" +
                "* c = 13  *************",Metodos.counter2("quis hendrerit dolor magna eget est lorem ipsum dolor sit amet consectetur adipiscing elit pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas integer eget aliquet nibh praesent tristique magna sit amet purus gravida quis blandit turpis cursus in hac habitasse platea dictumst quisque sagittis purus sit amet volutpat consequat mauris nunc congue nisi vitae suscipit tellus mauris a diam maecenas sed enim ut sem viverra"));
    }
}