package com.company.airport.ui.forms;

import com.company.airport.model.Airport;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class AirportTableModel extends AbstractTableModel {
    private static final String[] columns = {"Name", "City", "Country", "IATA", "ICAO"};

    private List<Airport> airports = new ArrayList<>();

    @Override
    public int getRowCount() {
        return airports.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if(airports.size() <= rowIndex){
            return null;
        }

        Airport airport = airports.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return airport.getName();
            case 1:
                return airport.getCity();
            case 2:
                return airport.getCountry();
            case 3:
                return airport.getIata();
            case 4:
                return airport.getIcao();
        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }

    public void setAirports(List<Airport> airports) {
        this.airports.clear();
        this.airports.addAll(airports);
        fireTableDataChanged();
    }

    public List<Airport> getAirportsByRows(int[] selectedRows) {
        List<Airport> list = new ArrayList<>();
        for (int selectedRow : selectedRows) {
            list.add(airports.get(selectedRow));
        }
        return list;
    }
}
