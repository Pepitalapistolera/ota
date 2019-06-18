package ar.edu.unahur.obj2;

import ar.edu.unahur.obj2.proveedores.Proveedor;

import java.util.List;
import java.util.Random;

public class DistribuidorDeTrafico {

    private Random random = new Random();
    private List<Proveedor> proveedor;

    public DistribuidorDeTrafico(Random random, List<Proveedor> proveedor) {
        this.random = random;
        this.proveedor = proveedor;
    }

    public Proveedor proveedor() {
        return proveedor.get(random.nextInt(proveedor.size()));
    }
}
