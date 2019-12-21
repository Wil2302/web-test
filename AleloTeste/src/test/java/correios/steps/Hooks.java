package correios.steps;

import correios.core.DriverFactory;
import correios.core.IBrowser;
import correios.core.ThreadDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	@Before
	public void beforeScenario() throws Exception {

		IBrowser browser = DriverFactory.getInstance().getBrowser();
		browser.setupBrowser();

	}

	@After(order = 0, value = { "@COREIOTESTE" })
	public void fecharBrowser() {
		ThreadDriver.getTDriver().quit();
		System.out.println("terminando");
	}

}
