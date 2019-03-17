package com.sherbansoftware.models

class Room {
    int roomNumber
    int singleBeds
    int doubleBeds
    ArrayList<RoomFeatures> features = []

    int getMaxOccupancy() {
        doubleBeds * 2 + singleBeds
    }
}
