/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portalweb.asset.webcontent.wcwebcontent.addwcwebcontent2displaypageap2;

import com.liferay.portalweb.portal.BaseTestCase;
import com.liferay.portalweb.portal.util.RuntimeVariables;

/**
 * @author Brian Wing Shun Chan
 */
public class ViewWCWebContent2DisplayPageAP2Test extends BaseTestCase {
	public void testViewWCWebContent2DisplayPageAP2() throws Exception {
		selenium.selectWindow("null");
		selenium.selectFrame("relative=top");
		selenium.open("/web/guest/home/");
		selenium.clickAt("link=Asset Publisher Test Page2",
			RuntimeVariables.replace("Asset Publisher Test Page2"));
		selenium.waitForPageToLoad("30000");
		assertEquals(RuntimeVariables.replace("WC WebContent2 Title"),
			selenium.getText("xPath=(//h3[@class='asset-title']/a)[1]"));
		assertEquals(RuntimeVariables.replace("WC WebContent2 Content"),
			selenium.getText("xPath=(//div[@class='asset-summary'])[1]"));
		assertEquals(RuntimeVariables.replace("WC WebContent1 Title"),
			selenium.getText("xPath=(//h3[@class='asset-title']/a)[2]"));
		assertEquals(RuntimeVariables.replace("WC WebContent1 Content"),
			selenium.getText("xPath=(//div[@class='asset-summary'])[2]"));
		selenium.clickAt("xPath=(//h3[@class='asset-title']/a)[1]",
			RuntimeVariables.replace("WC WebContent2 Title"));
		selenium.waitForPageToLoad("30000");
		assertEquals(RuntimeVariables.replace("WC WebContent2 Title"),
			selenium.getText("//h1[@class='header-title']/span"));
		assertEquals(RuntimeVariables.replace("WC WebContent2 Content"),
			selenium.getText("//div[@class='journal-content-article']/p"));
		selenium.open("/web/guest/home/");
		selenium.clickAt("link=Asset Publisher Test Page2",
			RuntimeVariables.replace("Asset Publisher Test Page2"));
		selenium.waitForPageToLoad("30000");
		assertEquals(RuntimeVariables.replace("WC WebContent1 Title"),
			selenium.getText("xPath=(//h3[@class='asset-title']/a)[2]"));
		selenium.clickAt("xPath=(//h3[@class='asset-title']/a)[2]",
			RuntimeVariables.replace("WC WebContent1 Title"));
		selenium.waitForPageToLoad("30000");
		assertEquals(RuntimeVariables.replace("WC WebContent1 Title"),
			selenium.getText("//h1[@class='header-title']/span"));
		assertEquals(RuntimeVariables.replace("WC WebContent1 Content"),
			selenium.getText("//div[@class='journal-content-article']/p"));
	}
}