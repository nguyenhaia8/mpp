CREATE DATABASE LAB7;
USE LAB7;

CREATE TABLE Hotel(
	hotelNo VARCHAR(5) NOT NULL,
    hotelName VARCHAR(20) NOT NULL,
    city VARCHAR(20) NOT NULL,
    PRIMARY KEY(hotelNo)
);

CREATE TABLE Room (
	roomNo VARCHAR(5) NOT NULL,
    hotelNo VARCHAR(5) NOT NULL,
    type VARCHAR(10),
    price DECIMAL(10,2),
    PRIMARY KEY(hotelNo, roomNo),
    FOREIGN KEY (hotelNo) REFERENCES Hotel(hotelNo)
);

CREATE TABLE Guest (
	guestNo VARCHAR(5) PRIMARY KEY,
    guestName VARCHAR(100),
    guestAddress VARCHAR(255)
);

CREATE TABLE Booking (
	hotelNo VARCHAR(5),
    guestNo VARCHAR(5),
    dateFrom DATE,
    dateTo DATE,
    roomNo VARCHAR(5),
    PRIMARY KEY(hotelNo, guestNo, dateFrom),
    FOREIGN KEY (hotelNo, roomNo) REFERENCES Room(hotelNo, roomNo),
    FOREIGN KEY (guestNo) REFERENCES Guest(guestNo)
);

INSERT INTO Hotel VALUES 
('H01', 'Grosvenor Hotel', 'London'),
('H02', 'Ocean View', 'Miami'),
('H03', 'Mountain Retreat', 'Denver');


INSERT INTO Room VALUES 
('101', 'H01', 'Single', 50.00),
('102', 'H01', 'Double', 35.00),
('103', 'H01', 'Family', 39.00),
('201', 'H02', 'Single', 70.00),
('202', 'H02', 'Double', 120.00),
('301', 'H03', 'Double', 65.00);

INSERT INTO Guest VALUES 
('G01', 'Alice Smith', '23 London Rd, London'),
('G02', 'Bob Stone', '45 River Rd, Miami'),
('G03', 'Clara Oswald', '31 Queen St, London'),
('G04', 'David Tenn', '10 Aspen St, Denver');


INSERT INTO Booking VALUES 
('H01', 'G01', '2024-08-01', '2024-08-05', '102'),
('H01', 'G03', '2024-08-02', NULL,         '103'),
('H01', 'G02', '2024-07-10', '2024-07-15', '101'),
('H02', 'G04', '2024-08-03', '2024-08-08', '202'),
('H01', 'G04', '2024-08-10', '2024-08-15', '101');


-- 6.7
SELECT * FROM Hotel;

-- 6.8
SELECT * FROM Hotel where city = 'London';

-- 6.9
SELECT guestName, guestAddress FROM Guest
WHERE guestAddress LIKE '%London%'
ORDER BY guestName ASC;

-- 6.10
SELECT * FROM Room
WHERE TYPE IN ('Double', 'Family') AND price < 40
ORDER BY price ASC;

-- 6.11
SELECT * FROM Booking
WHERE dateTo IS NULL;

-- 6.12
SELECT COUNT(*) AS totalHotel FROM Hotel;

-- 6.13
SELECT AVG(price) AS avgRoomPrice FROM Room;

-- 6.14
SELECT SUM(price) AS sumPrice FROM Room
WHERE type = 'Double';

-- 6.15
SELECT COUNT(DISTINCT guestNo) AS count FROM Booking
WHERE MONTH(dateFrom) = 8 OR MONTH(dateTo) = 8;

-- 6.16
SELECT R.price, R.type FROM Room R 
JOIN Hotel H ON R.hotelNo = H.hotelNo
WHERE H.hotelName = 'Grosvenor Hotel';

-- 6.17
SELECT G.* FROM Guest G
JOIN Booking B ON G.guestNo = B.guestNo
JOIN Hotel H ON B.hotelNo = H.hotelNo
WHERE CURRENT_DATE BETWEEN B.dateFrom AND B.dateTo AND H.hotelName = 'Grosvenor Hotel';

-- 6.18
SELECT R.*, G.guestName  FROM Room R
JOIN Hotel H ON R.hotelNo = H.hotelNo
LEFT JOIN Booking B ON R.roomNo = B.roomNo AND R.hotelNo = B.hotelNo
LEFT JOIN Guest G ON B.guestNo = G.guestNo
WHERE H.hotelName = ' Grosvenor Hotel';

-- 6.19
SELECT SUM(R.price) AS totalIncome FROM Booking B
JOIN Room R ON B.hotelNo = R.hotelNo AND B.roomNo = R.roomNo
JOIN Hotel H ON R.hotelNo = H.hotelNo
WHERE H.hotelName = 'Grosvernor Hotel' AND CURRENT_DATE BETWEEN B.dateFrom AND B.dateTo;

-- 6.22
SELECT H.hotelName, count(roomNo) AS roomCount FROM Room R
JOIN Hotel H ON R.hotelNo = H.hotelNo
GROUP BY H.hotelNo;


-- 6.23
SELECT H.hotelName, count(roomNo) AS roomCount FROM Room R
JOIN Hotel H ON R.hotelNo = H.hotelNo
WHERE H.city = 'London'
GROUP BY H.hotelNo;

-- 6.24
SELECT H.hotelName, AVG(bookingCount) AS avgBookingsInAug FROM (
    SELECT B.hotelNo, COUNT(*) AS bookingCount
    FROM Booking B
    WHERE MONTH(B.dateFrom) = 8 OR MONTH(B.dateTo) = 8
    GROUP BY B.hotelNo
) AS BookingSummary
JOIN Hotel H ON BookingSummary.hotelNo = H.hotelNo
GROUP BY H.hotelName;














