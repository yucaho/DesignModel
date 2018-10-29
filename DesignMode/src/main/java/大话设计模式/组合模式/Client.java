package 大话设计模式.组合模式;

/**
 * Date 2018/10/24 16:53
 *
 * @author : lyc
 * @Description
 */
public class Client {
	public static void main(String[] args) {
		//生成树根root，根上长出两叶leafA和leafB
		Composite root = new Composite("root");
		root.Add(new Leaf("leafA"));
		root.Add(new Leaf("leafB"));

		//根上长处分支compositeX
		Composite compositeX = new Composite("Composite X");
		compositeX.Add(new Leaf("leaf XA"));
		compositeX.Add(new Leaf("leaf XB"));

		root.Add(compositeX);

		//在 CompositeX上在长处来分支 XY
		Composite compositeXY = new Composite("Composite XY");
		compositeXY.Add(new Leaf("leaf XYA"));
		compositeXY.Add(new Leaf("leaf XYB"));

		compositeX.Add(compositeXY);

		//根部又长出两片叶子，但可惜D没有长牢，被风吹走了
		root.Add(new Leaf("leaf C"));

		Leaf leaf = new Leaf("leaf D");
		root.Add(leaf);
		root.Remove(leaf);

		root.Display(1);
	}
}
