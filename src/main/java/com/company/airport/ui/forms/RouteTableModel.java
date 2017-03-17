package com.company.airport.ui.forms;

import com.company.airport.model.Route;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class RouteTableModel extends AbstractTableModel {
    private List<Route> routes;

    @Override
    public int getRowCount() {
        return routes != null ? routes.size() : 0;
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if(routes == null) {
            return null;
        }

        Route route = routes.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return route.getAirline().getName();
            case 1:
                return route.getSrcAirport().getName();
            case 2:
                return route.getDstAirport().getName();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Airline";
            case 1:
                return "Source";
            case 2:
                return "Destination";
            default:
                return null;
        }
    }

    public void setData(Iterable<Route> routes) {
        this.routes = new ArrayList<>();
        routes.forEach(this.routes::add);
        fireTableDataChanged();
    }
}
