/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure;

import DataStructure.Graph.Node;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author antho
 */
public class Graph extends HashSet<Node> {

    private boolean isBidirectionnal = true;

    public Graph(boolean isBidirectional) {
        this.isBidirectionnal = isBidirectional;
    }

    public static class Node {

        private final List<Edge> connections;
        private final String name;

        public Node(String name) {
            this.connections = new ArrayList<>();
            this.name = name;
        }

        public Node(Edge[] edges, String name) {
            this.connections = new ArrayList<>(Arrays.asList(edges));
            this.name = name;
        }

        public Node(List<Edge> connections, String name) {
            this.connections = connections;
            this.name = name;
        }

        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof Node)) {
                return false;
            }
            Node n = (Node) obj;
            return name.equals(n.name);
        }

        @Override
        public int hashCode() {
            int hash = 7;
            hash = 97 * hash + Objects.hashCode(this.name);
            return hash;
        }

        public boolean putEdge(final Edge e) {
            if (connections.stream().noneMatch((inner) -> inner.equals(e))) {
                return this.connections.add(e);
            } else {
                return false;
            }
        }

        public int degree() {
            return connections.size();
        }
    }

    private static class Edge {

        private final Node A, B;
        private boolean isBidirectionnal = true;
        private final int weight = 0;

        public Edge(Node A, Node B, boolean isBidirectionnal) {
            this.A = A;
            this.B = B;
            this.isBidirectionnal = isBidirectionnal;
        }

        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof Edge)) {
                return false;
            }
            Edge e = (Edge) obj;
            return this.A.equals(e.A) && this.B.equals(e.B)
                    || this.A.equals(e.B) && this.B.equals(e.A);
        }

        @Override
        public int hashCode() {
            int hash = 7;
            hash = 83 * hash + Objects.hashCode(this.A);
            hash = 83 * hash + Objects.hashCode(this.B);
            return hash;
        }

        @Override
        public String toString() {
            String connector = isBidirectionnal ? "<--------->" : "---------->";
            return new StringBuilder().append(A.name).append(connector).append(B.name).toString();
        }

        public String reversedToString() {
            String connector = isBidirectionnal ? "<--------->" : "<----------";
            return new StringBuilder().append(B.name).append(connector).append(A.name).toString();
        }

    }

    private boolean find(Node n) {
        return this.stream().anyMatch(
                (inner) -> n.equals(inner)
        );
    }

    public boolean find(String nodeName) {
        return this.stream().anyMatch(
                (inner) -> nodeName.equals(inner.name)
        );
    }

    @Override
    public boolean add(Node e) {
        return !find(e) ? super.add(e) : false;
    }

    public boolean attach(String a, String b) {
        Object[] nodes = this.stream().filter(
                (inner) -> a.equals(inner.name) || b.equals(inner.name)
        ).toArray();
        Node n1, n2;
        if (a.equals(b)) {
            n1 = (Node) nodes[0];
            n2 = n1;
        } else if (nodes.length != 2) {
            return false;
        } else {
            n1 = (Node) nodes[0];
            n2 = (Node) nodes[1];
        }
        Edge e = new Edge(n1, n2, isBidirectionnal);
        return n1.putEdge(e) && n2.putEdge(e);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GRAPH=>\n{");
        this.stream().forEach(
                (node) -> {
                    sb.append("\n\tNODE => ").append(node.name);

                    node.connections.stream().forEach((e) -> {
                        sb.append("\n\t\t");
                        if (node.name.equals(e.A.name)) {
                            sb.append(e.toString());
                        } else {
                            sb.append(e.reversedToString());
                        }
                    });
                }
        );
        sb.append("\n}");
        return sb.toString();
    }

}
