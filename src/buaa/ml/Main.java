package buaa.ml;

public class Main {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Classifier c = new NaiveClassifier();
		c.Init();
		c.BalanceSample(200);
		//c.RandomSample(200);
		c.Run();
		c.TestMethod();
	}

}
