package entrega2;

public class TestEstructurasLineales {

    public static void main(String[] args) {

        System.out.println("===== INICIANDO PRUEBAS DE ESTRUCTURAS LINEALES =====\n");
        
        // ----- Prueba de ListaOrdenada -----
        System.out.println("----- Prueba de ListaOrdenada -----");
        ListaOrdenada<Integer> listaOrdenada = new ListaOrdenada<>();
        System.out.print("Añadiendo elementos: ");
        listaOrdenada.add(5);
        listaOrdenada.add(2);
        listaOrdenada.add(8);
        listaOrdenada.add(1);
        listaOrdenada.add(3);
        System.out.println("5, 2, 8, 1, 3");

        System.out.println("Elementos en la lista: " + listaOrdenada);
        System.out.println("Tamaño de la lista: " + listaOrdenada.size());

        listaOrdenada.remove(0);
        System.out.println("Eliminando el primer elemento: 1");
        System.out.println("Elementos después de eliminar: " + listaOrdenada);

        listaOrdenada.addAll(new Integer[]{4, 6, 7});
        System.out.println("Añadiendo elementos en lote: 4, 6, 7");
        System.out.println("Elementos después de añadir lote: " + listaOrdenada);

        listaOrdenada.clear();
        System.out.println("Eliminando todos los elementos: " + listaOrdenada);
        System.out.println("¿Está vacía? " + listaOrdenada.isEmpty() + "\n");

        // Prueba con Strings
        ListaOrdenada<String> listaStrings = new ListaOrdenada<>();
        listaStrings.add("apple");
        listaStrings.add("banana");
        listaStrings.add("cherry");
        listaStrings.add("date");
        System.out.println("Prueba con strings:");
        System.out.println("Elementos ordenados: " + listaStrings + "\n");

        // ----- Prueba de ListaOrdenadaSinRepeticion -----
        System.out.println("----- Prueba de ListaOrdenadaSinRepeticion -----");
        ListaOrdenadaSinRepeticion<Integer> listaOrdenadaSinRep = new ListaOrdenadaSinRepeticion<>();
        System.out.print("Añadiendo elementos: ");
        listaOrdenadaSinRep.add(5);
        listaOrdenadaSinRep.add(2);
        listaOrdenadaSinRep.add(8);
        listaOrdenadaSinRep.add(1);
        listaOrdenadaSinRep.add(3);
        listaOrdenadaSinRep.add(5);
        listaOrdenadaSinRep.add(2);
        System.out.println("5, 2, 8, 1, 3, 5, 2");

        System.out.println("Elementos en la lista: " + listaOrdenadaSinRep);
        System.out.println("Tamaño de la lista: " + listaOrdenadaSinRep.size());
        System.out.println("Se esperan 5 elementos únicos ordenados");

        listaOrdenadaSinRep.remove(0);
        System.out.println("Eliminando el primer elemento: 1");
        System.out.println("Elementos después de eliminar: " + listaOrdenadaSinRep);

        listaOrdenadaSinRep.addAll(new Integer[]{4, 6, 7, 4});
        System.out.println("Añadiendo elementos en lote: 4, 6, 7, 4");
        System.out.println("Elementos después de añadir lote: " + listaOrdenadaSinRep);
        System.out.println("Se espera que el 4 aparezca solo una vez\n");

        // ----- Prueba de Cola (FIFO) -----
        System.out.println("----- Prueba de Cola (FIFO) -----");
        Cola<String> cola = new Cola<>();
        System.out.print("Añadiendo elementos: ");
        cola.enqueue("primero");
        cola.enqueue("segundo");
        cola.enqueue("tercero");
        System.out.println("'primero', 'segundo', 'tercero'");

        System.out.println("Elementos en la cola: " + cola);
        System.out.println("Tamaño de la cola: " + cola.size());

        System.out.println("Desencolando elementos:");
        System.out.println("Desencolado: " + cola.dequeue());
        System.out.println("Cola restante: " + cola);
        System.out.println("Desencolado: " + cola.dequeue());
        System.out.println("Cola restante: " + cola);
        System.out.println("Desencolado: " + cola.dequeue());
        System.out.println("Cola restante: " + cola);

        System.out.println("¿Está vacía? " + cola.isEmpty());

        try {
            cola.dequeue();
        } catch (Exception e) {
            System.out.println("Excepción correctamente lanzada al intentar desencolar de una cola vacía: " + e.getMessage());
        }

        // ----- Prueba de Pila (LIFO) -----
        System.out.println("\n----- Prueba de Pila (LIFO) -----");
        Pila<Double> pila = new Pila<>();
        System.out.print("Añadiendo elementos: ");
        pila.push(1.1);
        pila.push(2.2);
        pila.push(3.3);
        System.out.println("1.1, 2.2, 3.3");

        System.out.println("Elementos en la pila: " + pila);
        System.out.println("Tamaño de la pila: " + pila.size());
        System.out.println("Elemento en el tope: " + pila.peek());

        System.out.println("Desapilando elementos:");
        System.out.println("Desapilado: " + pila.pop());
        System.out.println("Pila restante: " + pila);
        System.out.println("Desapilado: " + pila.pop());
        System.out.println("Pila restante: " + pila);
        System.out.println("Desapilado: " + pila.pop());
        System.out.println("Pila restante: " + pila);

        System.out.println("¿Está vacía? " + pila.isEmpty());

        try {
            pila.peek();
        } catch (Exception e) {
            System.out.println("Excepción correctamente lanzada al intentar acceder al tope de una pila vacía: " + e.getMessage());
        }

        // ----- Prueba de ColaPrioridad -----
        System.out.println("\n----- Prueba de ColaPrioridad -----");
        ColaPrioridad<String> colaPrioridad = new ColaPrioridad<>();
        System.out.println("Añadiendo elementos con prioridad:");

        colaPrioridad.enqueue("Crítico", 1);
        System.out.println("'Crítico' con prioridad 1");

        colaPrioridad.enqueue("Normal", 3);
        System.out.println("'Normal' con prioridad 3");

        colaPrioridad.enqueue("Urgente", 2);
        System.out.println("'Urgente' con prioridad 2");

        colaPrioridad.enqueue("Bajo", 4);
        System.out.println("'Bajo' con prioridad 4");

        System.out.println("Elementos en la cola por prioridad: " + colaPrioridad);
        System.out.println("Elementos con sus prioridades: " + colaPrioridad.getElements());
        System.out.println("Tamaño de la cola: " + colaPrioridad.size());

        colaPrioridad.changePriority("Normal", 1);
        System.out.println("Cambiando la prioridad de 'Normal' de 3 a 1:");
        System.out.println("Elementos con prioridad actualizada: " + colaPrioridad);

        System.out.println("Desencolando elementos por prioridad:");
        System.out.println("Desencolado: " + colaPrioridad.dequeue());
        System.out.println("Cola restante: " + colaPrioridad);
        System.out.println("Desencolado: " + colaPrioridad.dequeue());
        System.out.println("Cola restante: " + colaPrioridad);
        System.out.println("Desencolado: " + colaPrioridad.dequeue());
        System.out.println("Cola restante: " + colaPrioridad);
        System.out.println("Desencolado: " + colaPrioridad.dequeue());
        System.out.println("Cola restante: " + colaPrioridad);

        System.out.println("¿Está vacía? " + colaPrioridad.isEmpty());

        try {
            colaPrioridad.dequeue();
        } catch (Exception e) {
            System.out.println("Excepción correctamente lanzada al intentar desencolar de una cola vacía: " + e.getMessage());
        }

        // Prueba con addAll
        System.out.println("\nPrueba con addAll:");
        String[] tareas = {"Tarea A", "Tarea B", "Tarea C"};
        colaPrioridad.addAll(tareas, 2);
        System.out.println("Elementos añadidos en lote con prioridad 2: " + colaPrioridad);
        colaPrioridad.enqueue("Tarea Urgente", 1);
        System.out.println("Después de añadir 'Tarea Urgente' con prioridad 1: " + colaPrioridad);

        System.out.println("\n===== TODAS LAS PRUEBAS COMPLETADAS =====");
    }
}

