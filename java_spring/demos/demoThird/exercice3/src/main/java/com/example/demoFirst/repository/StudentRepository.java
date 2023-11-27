package com.example.demoFirst.repository;

import com.example.demoFirst.model.Student;
import com.example.demoFirst.tool.DatabaseConfig;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {

    public List<Student> findAll() {
        List<Student> students = new ArrayList<>();
        String sql = "SELECT * FROM students";

        try {
            Connection connection = DatabaseConfig.getConnection();
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()){
                Student student = new Student();
                student.setId(rs.getLong("id"));
                student.setFirstName(rs.getString("first_name"));
                student.setLastName(rs.getString("last_name"));
                student.setAge(rs.getInt("age"));
                students.add(student);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    return students;
    }

    public Student findById(Long id){
        String sql = "SELECT * FROM students WHERE id = ?";
        Connection connection = null;
        try {
            connection = DatabaseConfig.getConnection();
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setLong(1,id);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                Student student = new Student();
                student.setId(rs.getLong("id"));
                student.setFirstName(rs.getString("first_name"));
                student.setLastName(rs.getString("last_name"));
                student.setAge(rs.getInt("age"));
                return student;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
  return null;
    }

    public Student save(Student student){
        String sql = "INSERT INTO students (first_name,last_name, age)values(?,?,?)";
        Connection connection = null;
        try {
            connection = DatabaseConfig.getConnection();
            PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, student.getFirstName());
            stmt.setString(2, student.getLastName());
            stmt.setLong(3, student.getAge());
            int affectRow = stmt.executeUpdate();

            if(affectRow>0){
                ResultSet set = stmt.getGeneratedKeys();
                if(set.next()){
                    student.setId(set.getLong(1));
                }
            }
            return student;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }


    public void deleteById(Long id){
        String sql = "DELETE FROM students WHERE id = ?";
        Connection connection = null;
        try {
            connection = DatabaseConfig.getConnection();
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setLong(1,id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void update(Student student){
        String sql = "UPDATE students SET first_name = ?, last_name = ?, age = ? WHERE id = ?";
        Connection connection = null;
        try {
            connection = DatabaseConfig.getConnection();
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, student.getFirstName());
            stmt.setString(2, student.getLastName());
            stmt.setInt(3, student.getAge());
            stmt.setLong(4, student.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }





}
