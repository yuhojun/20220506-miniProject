package Porject.PorjectImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import Porject.Porject.service.FishVO;


public class FishServiceimpl implements Fishservice {
	 private DataSource dataSource = DataSource.getInstance();
	 private Connection conn = dataSource.getConnction();
	private PreparedStatement psmt;  //sql 명령실행
	private ResultSet rs; //select 결과를 담음
	
	@Override
	public List<FishVO> selectListFish() {
		// 전체 학생 목록 가져오기
		List<FishVO> students = new ArrayList<FishVO>();
		FishVO student;
		String sql = "SELECT * FROM STUDENT";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery(); //sql을 실행하고 결과를 담음
			while(rs.next()) { //초기화
				Fish = new FishVO();
				Fish.setUserld(rs.getString("userld"));
				Fish.setName(rs.getString("name"));
				Fish.setPassword(rs.getDate("password"));
				Fishs.add(Fish); //리스트 추가
				
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		return students;
	}

	@Override
	public FishVO selectFish(FishVO Fish) {
		// 한명 조회
		
		FishVO vo = new FishVO();
		String sql = "select * from student where studentid = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, Fish.getuserId());
			rs = psmt.executeQuery();
			if(rs.next()) {
				vo.setuserId(rs.getString("user"));
				vo.setName(rs.getString("name"));
				vo.setPassword(rs.getString("password"));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return vo;
	}

	@Override
	public int insertFish(FishVO Fish) {
		//한명추가
		int n = 0;
		String sql = "INSERT INTO STUDENT VALUES(?,?,?,?,?,?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, Fish.getUserId());
			psmt.setString(2, Fish.getName());
			psmt.setDate(3, Fish.getPassword());
			
			n = (int) psmt.executeLargeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return n;
	}

	@Override
	public int updateFish(FishVO Fish) {
		// 한명 정보 변경
		int n = 0;
		String sql = "UPDATE STUDENT SET MAJOR = ?, "
				+ "ADDRESS = ?, TEL = ? WHERE STUDENTID = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, Fish.getUserId());
			psmt.setString(2, Fish.getName());
			psmt.setString(3, Fish.getPassword());
			n = psmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return n;
	}

	@Override
	public int deletsFish(FishVO Fish) {
		// 한명 삭제
		int n = 0;
		String sql = "delet from student where studentid = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, Fish.getuserId());
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return n;
	}
}
