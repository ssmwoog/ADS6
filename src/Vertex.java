import java.util.*;

public class Vertex<V> {
    private V data;
    private Map<Vertex<V>, Double> adjacentVertices; // with weights

    public Vertex(V data) {
        this.data = data;
        this.adjacentVertices = new HashMap<Vertex<V>, Double>();
    }

    public void addAdjacentVertex(Vertex<V> destination, double weight) {
        adjacentVertices.put(destination, weight);
    }

    public V getData() {
        return data;
    }

    public void removeAdjacentVertex(Vertex<V> vertex) {
        Double value = adjacentVertices.remove(vertex);

        if (value == null) {
            for (Vertex<V> v: adjacentVertices.keySet()) {
                if (vertex.data.equals(vertex.getData())) {
                    adjacentVertices.remove(v);
                }
            }
        }
    }
}