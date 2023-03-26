package com.flyaway.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.flyaway.model.Flight;

public class FlightDataUtil {
	private DataSource datasource;

	public FlightDataUtil(DataSource datasource) {

		this.datasource = datasource;
	}

	public List<Flight> search(String date, String source, String destination,int person) {
		List<Flight> list = new ArrayList<>();
		Connection connection = null;
		Flight flight = null;
		PreparedStatement preparedstatement = null;
		ResultSet resultSet=null;
		try {
			connection = this.datasource.getConnection();
			String sql = "select FlightId,AirLine, Price ,Available_dates from flights where Available_dates = ? and Flight_Source = ? and Destination= ?";
			preparedstatement = connection.prepareStatement(sql);

			preparedstatement.setString(1, date);
			preparedstatement.setString(2, source);
			preparedstatement.setString(3, destination);
			resultSet = preparedstatement.executeQuery();
			while (resultSet.next()) {
				int flightid = resultSet.getInt("FlightId");
				String dateUtil = resultSet.getString("Available_dates");
				String airline = resultSet.getString("Airline");
				int price = resultSet.getInt("price");
				flight = new Flight(flightid, dateUtil, airline, price,person);
				list.add(flight);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			close(connection,preparedstatement,resultSet);
		}
		return list;
	}

	private void close(Connection con, PreparedStatement stmt, ResultSet rs) {
		try {
			if (rs != null)
				rs.close();
			if (stmt != null)
				stmt.close();

			if (con != null)
				con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public Flight getFlightdetails(int flightid,String person) {
		Connection connection = null;
		Flight flight = null;
		PreparedStatement preparedstatement = null;
		ResultSet resultSet=null;
		try {
			connection = this.datasource.getConnection();
			String sql = "select * from flights where FlightId = ?";
			preparedstatement = connection.prepareStatement(sql);

			preparedstatement.setInt(1, flightid);
			
			resultSet = preparedstatement.executeQuery();
			while (resultSet.next()) {
				String source = resultSet.getString("Flight_Source");
				String destination = resultSet.getString("Destination");
				String dateUtil = resultSet.getString("Available_dates");
				String airline = resultSet.getString("Airline");
				int price = resultSet.getInt("price");
				flight = new Flight(flightid,source,destination,dateUtil, airline, price,person);
				
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			close(connection,preparedstatement,resultSet);
		}
		return flight;
	}

	public List<Flight> search( ) {
		
		List<Flight> list = new ArrayList<>();
		Connection connection = null;
		Flight flight = null;
		PreparedStatement preparedstatement = null;
		ResultSet resultSet=null;
		try {
			connection = this.datasource.getConnection();
			String sql = "select FlightId,Flight_Source,Destination,AirLine, Price from flights ";
			preparedstatement = connection.prepareStatement(sql);

		
			resultSet = preparedstatement.executeQuery();
			while (resultSet.next()) {
				int flightid = resultSet.getInt("FlightId");
				String source = resultSet.getString("Flight_Source");
				String destination = resultSet.getString("Destination");
				String airline= resultSet.getString("Airline");
				int price = resultSet.getInt("Price");
				flight = new Flight(flightid, source,destination, airline, price);
				list.add(flight);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			close(connection,preparedstatement,resultSet);
		}
		return list;
	}
		
	

}
