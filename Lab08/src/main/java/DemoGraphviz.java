
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sara
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import guru.nidi.graphviz.engine.Format;
import guru.nidi.graphviz.engine.Graphviz;
import static guru.nidi.graphviz.model.Factory.graph;
import guru.nidi.graphviz.model.Graph;
import guru.nidi.graphviz.model.MutableGraph;
import guru.nidi.graphviz.parse.Parser;



public class DemoGraphviz {
      public void createDemoGraph() throws IOException {
		Graph g;
          g = graph("example1").directed().with(node("a").link(node("b")));
		Graphviz.fromGraph(g).width(200).render(Format.PNG).toFile(new File("example/ex1.png"));
	}
	
	public void createDemoFromDot() throws IOException {
		File file = new File("/Users/tuxtor/Downloads/linked_list.dot");
		FileInputStream fis = null;
		
		fis = new FileInputStream(file);
		
		MutableGraph g = Parser.read(fis);
		Graphviz.fromGraph(g).width(700).render(Format.PNG).toFile(new File("example/ex4-1.png"));
	}

    private Object node(String a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
