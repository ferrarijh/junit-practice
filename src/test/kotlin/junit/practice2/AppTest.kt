package junit.practice2

import org.junit.Test
import org.junit.Assert.assertEquals

class AppTest{
    @Test
    fun testAdd(){
        val c = Calculator()
        val res = c.add(1.0, 2.0)
        assertEquals(3.0, res, 0.0)
    }
    @Test
    fun testMulti(){
        val c = Calculator()
        val res = c.multi(1.0, 2.0)
        assertEquals(2.0, res, 0.0)
    }
}