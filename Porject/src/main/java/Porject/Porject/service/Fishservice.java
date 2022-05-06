package Porject.Porject.service;

import java.util.List;

public class Fishservice {
	List<FishVO> selectListFish(); 
	FishVO selectFish(FishVO Fish); 
	int insertFish(FishtVO Fish); 
	int updateFish(FishVO Fish); 
	int deletsFish(FishVO Fish); 
}
