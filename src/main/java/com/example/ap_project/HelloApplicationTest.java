package com.example.ap_project;
import org.testng.annotations.Test;


import static org.testng.Assert.assertNotNull;

public class HelloApplicationTest {




    @Test
    public void testThreadStart() {
        assertNotNull(HelloApplication.t1, "Threadstart should be initialized");
    }

    @Test
    public void testPingInitialization() {
        assertNotNull(HelloApplication.t2, "Ping should be initialized");
    }

    @Test
    public void testmenu_start() {
        assertNotNull(HelloApplication.test, "Menu_music should be initialized");
    }

    @Test
    public void testplaymusic() {
        assertNotNull(HelloApplication.p, "Music should be initialized");
    }


}
