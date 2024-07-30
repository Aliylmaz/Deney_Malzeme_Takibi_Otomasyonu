



# Deney Malzeme Takibi Otomasyonu

## Material Tracking System

This project is a comprehensive inventory management system developed as part of the Computer Programming 2 course. The system is designed to facilitate the tracking of experimental materials within an organization. It includes functionalities such as user authentication, material addition and removal, material search and update, request creation and deletion, and detailed company information.

## Features

### User Authentication
- **Login Screen**: Identifies users as Admin or Personnel based on their credentials.
- **Registration Screen**: Allows new users to register with validation checks.

### Main Screen
- **Navigation**: Easy access to various functionalities including Add/Delete Materials, Search/Update Materials, Create/Delete Requests, and Company Information.
- **Pop-up Menus**: Provides quick access to different sections.

### Material Management
- **Add Materials**: Input fields for ID, name, category, stock, expiry date, supplier, and description, with validation checks to ensure data integrity.
- **Delete Materials**: Admin-only functionality to securely remove materials from the database.
- **Search and Update Materials**: Allows users to search for specific materials and update their information as needed.

### Request Management
- **Create Requests**: Input fields for material request, priority, quantity, date, category, and justification, with validation checks.
- **Update and Delete Requests**: Admin-only functionality to manage requests, including updating and deleting entries.

### Company Information
- **Tabbed Pane**: Contains sections for the company logo and meaning, detailed company information, and company policies.

## Classes
- **Materials Class**: Manages attributes and methods related to materials.
- **Users Class**: Handles user information and related methods.
- **Request Class**: Manages attributes and methods for material requests.
- **Database Class**: Contains methods for database operations, including adding, searching, updating, and deleting records.

This project showcases a robust implementation of an inventory management system with a user-friendly interface and role-based access control. It provides a practical solution for efficiently managing experimental materials.
