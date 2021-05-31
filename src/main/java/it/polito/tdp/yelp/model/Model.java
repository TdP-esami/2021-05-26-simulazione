package it.polito.tdp.yelp.model;

import java.time.Year;
import java.util.List;

import org.jgrapht.Graph;
import org.jgrapht.Graphs;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.SimpleDirectedWeightedGraph;

import it.polito.tdp.yelp.db.YelpDao;

public class Model {
	
	private Graph<Business, DefaultWeightedEdge> grafo ;
	private List<Business> vertici ;
	
	public List<String> getAllCities() {
		YelpDao dao = new YelpDao() ;
		return dao.getAllCities() ;
	}
	
	public String creaGrafo(String city, Year anno) {
		this.grafo = new SimpleDirectedWeightedGraph<Business, DefaultWeightedEdge>(DefaultWeightedEdge.class) ;
		YelpDao dao = new YelpDao() ;
		this.vertici = dao.getBusinessByCityAndYear(city, anno) ;
		Graphs.addAllVertices(this.grafo, this.vertici) ;
		
		return String.format("Grafo creato con %d vertici e %d archi\n",
				this.grafo.vertexSet().size(),
				this.grafo.edgeSet().size()) ;
	}
	
	
}
