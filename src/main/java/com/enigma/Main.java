package com.enigma;

import com.enigma.entity.OutletRepo;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<OutletRepo> outletRepoList = Arrays.asList(
                new OutletRepo("Manggarai", "01-01-2022", 1000,10),
                new OutletRepo("BSD", "01-01-2022", 750,19),
                new OutletRepo("Manggarai", "12-01-2022", 1025,32),
                new OutletRepo("Ragunan", "01-01-2022", 375,12),
                new OutletRepo("Ragunan", "02-01-2022", 397,13),
                new OutletRepo("BSD", "03-01-2022", 803,20),
                new OutletRepo("Pasar Minggu", "01-01-2022", 35,3),
                new OutletRepo("Pasar Minggu", "12-01-2022", 5,1),
                new OutletRepo("Manggarai", "15-01-2022", 1005,31)
        );

//        ALL LIST
        List<OutletRepo> outletRepoAll = outletRepoList.stream().map(p -> p).collect(Collectors.toList());
//        Max Omset
        Collections.singletonList(outletRepoList.stream().max(Comparator.comparing(OutletRepo::getOmset)).orElseThrow(NoSuchElementException::new)).forEach(outletRepo -> System.out.println("Outlet With the Biggest Omset : "+outletRepo.getOutlet()));

//        Min Omset
        Collections.singletonList(outletRepoList.stream().min(Comparator.comparing(OutletRepo::getOmset)).orElseThrow(NoSuchElementException::new)).forEach(outletRepo -> System.out.println("Outlet With the Lower Omset : "+outletRepo.getOutlet()));

//        omset less than 600
        List<OutletRepo> omsetLessThan600 = (List<OutletRepo>) outletRepoList.stream().filter(n-> n.getOmset() < 600).collect(Collectors.toList());
        System.out.println("Omset Less Than 600 = "+omsetLessThan600);
        System.out.println();

//        Date Min Transaction
        Collections.singletonList(outletRepoList.stream().min(Comparator.comparing(OutletRepo::getTotal)).orElseThrow(NoSuchElementException::new)).forEach(outletRepo -> System.out.println("Date with the lower transaction : "+outletRepo.getPeriod()));

//        Omset Each Outlet
        System.out.println("\nTotal Omset per Outlet");
        outletRepoList.stream().collect(Collectors.groupingBy(outlet -> outlet.getOutlet(), Collectors.summingInt(outlet->outlet.getTotal()))).forEach((outlet,sumTransaksi)->System.out.println(outlet+" : "+sumTransaksi));

//        total omset and transaction
        Integer total_omset = outletRepoList.stream().collect(Collectors.summingInt(OutletRepo::getOmset));
        Integer total_transaction = outletRepoList.stream().collect(Collectors.summingInt(OutletRepo::getTotal));
        System.out.println();
        System.out.println("Total Omset : "+total_omset);
        System.out.println("Total Transaction : "+total_transaction);


        System.out.println();
        System.out.println("All Outlet = "+outletRepoAll);







    }
}