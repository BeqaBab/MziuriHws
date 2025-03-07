package HW0226;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;

class Worker{
    StringBuilder name;
    StringBuilder departmentName;
    int salary;
    Worker(StringBuilder name, StringBuilder departmentName, int salary){
        this.name = name;
        this.departmentName = departmentName;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name=" + name +
                ", departmentName=" + departmentName +
                ", salary=" + salary +
                '}';
    }
}

class Randomizer{
    static StringBuilder randomizer(){
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < 16; i++){
            if(random.nextBoolean()){
                stringBuilder.append(random.nextInt('0',  '9'));
            }   else{
                if(random.nextBoolean()){
                    stringBuilder.append((char)random.nextInt('a', 'z'));
                }   else stringBuilder.append((char)random.nextInt('A', 'Z'));
            }
        }   return stringBuilder;
    }
}

class workersSalaries implements Comparator<Worker>{
    @Override
    public int compare(Worker o1, Worker o2) {
        return -1 * Integer.compare(o1.salary, o2.salary);
    }
}

public class Task1 {
    public static void main(String[] args){
        List<Worker> workers = new ArrayList<>(0);
        Random random = new Random();
        Supplier<StringBuilder> names = Randomizer::randomizer;
        for(int i = 0; i < 15; i++){
            Worker worker = new Worker(names.get(),names.get(), random.nextInt(600));
            workers.add(worker);
        }
        System.out.println("The workers with 500+ salaries:");
        workers.stream().filter(worker -> worker.salary > 500).forEach(System.out::println);
        System.out.println();

        System.out.println("Sorted by salaries:");
        workers.stream().sorted(new workersSalaries()).forEach(System.out::println);
        System.out.println();

        System.out.println("Only names:");
        Map <Integer, StringBuilder> onlyNames = workers.stream().collect(Collectors.toMap(i -> i.salary, i -> i.name));
        System.out.println(onlyNames);

        System.out.println();
        System.out.println("Only five:");
        workers.stream().limit(5).forEach(System.out::println);
    }
}
