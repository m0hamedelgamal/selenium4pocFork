/*      Copyright 2022 Mohammad Faisal Khatri

        Licensed under the Apache License, Version 2.0 (the "License");
        you may not use this file except in compliance with the License.
        You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

        Unless required by applicable law or agreed to in writing, software
        distributed under the License is distributed on an "AS IS" BASIS,
        WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        See the License for the specific language governing permissions and
        limitations under the License.
*/
package io.github.mfaisalkhatri.demoqa;

import io.github.mfaisalkhatri.driversetup.Setup;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created By Faisal Khatri on 30-12-2021
 */
public class DoubleClickTests extends Setup {

    private ButtonsPage buttonsPage;


    @BeforeClass
    public void testSetup() {
        final String webSite = "https://demoqa.com/buttons";
        driver.get(webSite);
        buttonsPage = new ButtonsPage(driver);
    }

    @Test
    public void testDoubleClick() {
        buttonsPage.doubleClickonButton();
        Assert.assertEquals(buttonsPage.getTextOnClick(), "You have done a double click");
    }

}