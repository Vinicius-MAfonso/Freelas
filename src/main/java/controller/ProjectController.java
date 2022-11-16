package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Project;
import util.ConnectionFactory;

public class ProjectController {
    public void save(Project project){
        String sql = "INSERT INTO projects(name, "
                + "description, "
                + "createdAt, "
                + "updatedAt)"
                + "VALUES (?, ?, ?, ?)";
        Connection c = null;
        PreparedStatement statement = null;
        try{
            c = ConnectionFactory.getConnection();
            statement = c.prepareStatement(sql);
            statement.setString(1, project.getName());
            statement.setString(2, project.getDescription());
            statement.setDate(3, new Date(project.getCreatedAt().getTime()));
            statement.setDate(4, new Date(project.getUpdatedAt().getTime()));
            statement.execute();
        }catch(SQLException sqle){
            throw new RuntimeException("Erro ao salvar",sqle);
        }finally{
            ConnectionFactory.closeConnection(c, statement);
        }
        
    }
    public void update(Project project){
        String sql = "UPDATE projects SET name = ?, description = ?, createdAt = ?, updatedAt = ? WHERE id = ?";
        Connection c = null;
        PreparedStatement statement = null;
        try{
            c = ConnectionFactory.getConnection();
            statement = c.prepareStatement(sql);
            statement.setString(1, project.getName());
            statement.setString(2, project.getDescription());
            statement.setDate(3, new Date(project.getCreatedAt().getTime()));
            statement.setDate(4, new Date(project.getUpdatedAt().getTime()));
            statement.setInt(5, project.getId());
            statement.execute();
        }catch(SQLException sqle){
            throw new RuntimeException("Erro ao atualizar",sqle);
        }finally{
            ConnectionFactory.closeConnection(c, statement);
        }
    }
    public void removeById(Project project){
        String sql = "DELETE FROM projects WHERE id = ?";
        Connection c = null;
        PreparedStatement statement = null;
        try{
            c = ConnectionFactory.getConnection();
            statement = c.prepareStatement(sql);
            statement.setInt(1, project.getId());
            statement.execute();
        }catch(SQLException sqle){
            throw new RuntimeException("Erro ao deletar projeto",sqle);
        }finally{
            ConnectionFactory.closeConnection(c, statement);
        }
    }
    public List<Project> getAll(){
        List<Project> projects = new ArrayList<>();
        String sql = "SELECT * FROM projects";
        PreparedStatement statement = null;
        Connection c = null;
        ResultSet resultSet = null;
        try{
            c = ConnectionFactory.getConnection();
            statement = c.prepareStatement(sql);
            resultSet = statement.executeQuery();
            while(resultSet.next()){
                Project project = new Project();
                project.setId(resultSet.getInt("id"));
                project.setName(resultSet.getString("name"));
                project.setDescription(resultSet.getString("description"));
                project.setCreatedAt(resultSet.getDate("createdAt"));
                project.setUpdatedAt(resultSet.getDate("updatedAt"));
                projects.add(project);
            }
        }catch(SQLException sqle){
            throw new RuntimeException("Erro ao recuperar os dados");
        }finally{
            ConnectionFactory.closeConnection(c, statement);
        }
        return projects;
    }
}
