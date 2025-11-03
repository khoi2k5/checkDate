package javaapplication2;

import org.junit.Test;
import static org.junit.Assert.*;

public class CheckDateTest {
    
    // --- Test các trường hợp hợp lệ ---
    @Test
    public void testValidDate_29_2_2000() {
        assertTrue(CheckDate.CheckDate(2, 2000, 29)); // Năm nhuận, hợp lệ
    }
    
    @Test
    public void testValidDate_30_4_2000() {
        assertTrue(CheckDate.CheckDate(4, 2000, 30)); // Tháng 4 có 30 ngày
    }
    
    @Test
    public void testValidDate_31_4_2000() {
        assertTrue(CheckDate.CheckDate(4, 2000, 30)); // Tháng 4 có 30 ngày
    }
    
}
