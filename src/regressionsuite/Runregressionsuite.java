package regressionsuite;

import browsercommands.Findelementspractice;

public class Runregressionsuite {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Login lo = new Login();
		lo.testcase1();
		lo.testcase2();
		lo.testcase3();
		lo.testcase5();
		lo.testcase6();
		Findelementspractice fp = new Findelementspractice();
		fp.browsertesting();
	}

}
