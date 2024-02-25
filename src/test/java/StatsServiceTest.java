import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ru.netology.stats.StatsService;

public class StatsServiceTest {


    @Test
    public void test1() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        long actual = service.SumSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;

        long actual = service.SumSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minSalesMonth3() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 9;
        int actual = service.minSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxSalesMonthTest4() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 8;
        int actual = service.maxSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countLessThanAvgTest5() {

        int expected = 0;
        int actual = 0;

        Assertions.assertEquals(expected, actual);
    }





    @Test
    public void countMoreThanAvgTest6() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 12;
        int actual = 12;


        Assertions.assertEquals(expected, actual);
    }

}







