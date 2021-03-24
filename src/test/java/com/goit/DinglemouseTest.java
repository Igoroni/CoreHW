package com.goit;

import Module4.Theory_task.Dinglemouse.Dinglemouse;
import org.junit.Test;

import static org.junit.Assert.*;

public class DinglemouseTest {

    @Test
    public void ex1() {
        char[][] house = {
                "  o                o        #######".toCharArray(),
                "###############             #     #".toCharArray(),
                "#             #        o    #     #".toCharArray(),
                "#  X          ###############     #".toCharArray(),
                "#                                 #".toCharArray(),
                "###################################".toCharArray()
        };
        assertTrue(Dinglemouse.allAlone(house));
    }

    @Test
    public void ex2() {
        char[][] house = {
                "#################             ".toCharArray(),
                "#     o         #   o         ".toCharArray(),
                "#          ######        o    ".toCharArray(),
                "####       #                  ".toCharArray(),
                "   #       ###################".toCharArray(),
                "   #                         #".toCharArray(),
                "   #                  X      #".toCharArray(),
                "   ###########################".toCharArray()
        };
        assertFalse(Dinglemouse.allAlone(house));
    }

    @Test
    public void random1() {
        char[][] house = {
                "################################".toCharArray(),
                "#                              #".toCharArray(),
                "#o                           o #".toCharArray(),
                "#   ########################   #".toCharArray(),
                "#   #                      #   #".toCharArray(),
                "#   #                      #   #".toCharArray(),
                "#   ########################   #".toCharArray(),
                "#                              #".toCharArray(),
                "#              X               #".toCharArray(),
                "################################".toCharArray()

        };
        assertFalse(Dinglemouse.allAlone(house));
    }

    @Test
    public void random2() {
        char[][] house = {
                "                  o             ".toCharArray(),
                "                               ".toCharArray(),
                "            #######             ".toCharArray(),
                "            #  X  #             ".toCharArray(),
                "            #     #             ".toCharArray(),
                "            #######             ".toCharArray(),
                "                                ".toCharArray()
        };
        assertTrue(Dinglemouse.allAlone(house));
    }

    @Test
    public void random3() {
        char[][] house = {
                "          ######################".toCharArray(),
                "          #                 X  #".toCharArray(),
                "        o #                    #".toCharArray(),
                "######    #     ################".toCharArray(),
                "#    #    #     #               ".toCharArray(),
                "#    #    #     #               ".toCharArray(),
                "#    #    #     #               ".toCharArray(),
                "#    ######     #               ".toCharArray(),
                "#               #               ".toCharArray(),
                "#################               ".toCharArray()
        };
        assertTrue(Dinglemouse.allAlone(house));
    }

    @Test
    public void random4() {
        char[][] house = {
                "#########              #########".toCharArray(),
                "#       #              #       #".toCharArray(),
                "#       #              #   X   #".toCharArray(),
                "#       #              #       #".toCharArray(),
                "#       ################       #".toCharArray(),
                "#                              #".toCharArray(),
                "#                              #".toCharArray(),
                "################################".toCharArray()
        };
        assertTrue(Dinglemouse.allAlone(house));
    }

    @Test
    public void random6() {
        char[][] house = {
                "################################".toCharArray(),
                "#                        o     #".toCharArray(),
                "#                              #".toCharArray(),
                "#   o      ########            #".toCharArray(),
                "#          #      #      X     #".toCharArray(),
                "############      #            #".toCharArray(),
                "                  ##############".toCharArray()
        };
        assertFalse(Dinglemouse.allAlone(house));
    }

    @Test
    public void random7() {
        char[][] house = {
                "                    o         ".toCharArray(),
                "   ###########o                 ".toCharArray(),
                "   #         #                  ".toCharArray(),
                "   #    X    #                  ".toCharArray(),
                "   #         ###################".toCharArray(),
                "   #                           #".toCharArray(),
                "   #####################       #".toCharArray(),
                "                       #       #".toCharArray(),
                "                       #########".toCharArray()
        };
        assertTrue(Dinglemouse.allAlone(house));
    }

    @Test
    public void random11() {
        char[][] house = {
                "################################".toCharArray(),
                "#                              #".toCharArray(),
                "#                              #".toCharArray(),
                "#          ########            #".toCharArray(),
                "#          #      #      X   o #".toCharArray(),
                "############      #            #".toCharArray(),
                "                  ##############".toCharArray(),
                "        o                       ".toCharArray()
        };
        assertFalse(Dinglemouse.allAlone(house));
    }
}
