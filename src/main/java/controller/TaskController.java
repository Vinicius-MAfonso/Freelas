package controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Task;
import util.ConnectionFactory;

public class TaskController {
    public void save(Task task){
        String sql = "INSERT INTO tasks (idProject, "
                + "name, "
                + "description, "
                + "completed, "
                + "notes, "
                + "deadline, "
                + "createdAt, "
                + "updatedAt) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        Connection c = null;
        PreparedStatement statement = null;
        try{
            c = ConnectionFactory.getConnection();
            statement = c.prepareStatement(sql);
            
            statement.setInt(1, task.getProjectId());
            statement.setString(2, task.getName());
            statement.setString(3, task.getDescription());
            statement.setBoolean(4, task.isIsCompleted());
            statement.setString(5, task.getNotes());
            statement.setDate(6, new Date(task.getDeadLine().getTime()));
            statement.setDate(7, new Date(task.getCreatedAt().getTime()));
            statement.setDate(8, new Date(task.getUpdatedAt().getTime()));
            
            statement.execute();
        }catch(SQLException sqle){
            throw new RuntimeException("Erro ao salvar a tarefa",sqle);
        }finally{
            ConnectionFactory.closeConnection(c,statement);
        }
    }
    public void update(Task task){
        String sql = "UPDATE tasks SET idProject = ?, "
                + "name = ?, "
                + "description = ?, "
                + "completed = ?, "
                + "notes = ?, "
                + "deadline = ?, "
                + "createdAt = ?, "
                + "updatedAt = ? "
                + "WHERE id = ?";
        Connection c = null;
        PreparedStatement statement = null;
        try{
            c = ConnectionFactory.getConnection();
            statement = c.prepareStatement(sql);
            
            statement.setInt(1, task.getProjectId());
            statement.setString(2, task.getName());
            statement.setString(3, task.getDescription());
            statement.setBoolean(4, task.isIsCompleted());
            statement.setString(5, task.getNotes());
            statement.setDate(6, new Date(task.getDeadLine().getTime()));
            statement.setDate(7, new Date(task.getCreatedAt().getTime()));
            statement.setDate(8, new Date(task.getUpdatedAt().getTime()));
            statement.setInt(9, task.getId());
            
            statement.execute();
        }catch(SQLException sqle){
            throw new RuntimeException("Erro ao atualizar os dados",sqle);
        }finally{
            ConnectionFactory.closeConnection(c, statement);
        }
            
            
    }
    public void removeById(int taskId){
        String sql = "DELETE FROM tasks WHERE id = ?";
        Connection c = null;
        PreparedStatement statement = null;
        try{
            c = ConnectionFactory.getConnection();
            statement = c.prepareStatement(sql);
            statement.setInt(1, taskId);
            statement.execute();
        }catch(SQLException sqle){
            throw new RuntimeException("Erro ao deletar a tarefa",sqle);
        }finally{
            ConnectionFactory.closeConnection(c,statement);
        }
        
        
    }
    public List<Task> getAll(int idProject){
        List<Task> tasks = new ArrayList();
        String sql = "SELECT * FROM tasks WHERE idProject = ?";
        Connection c = null;
        ResultSet resultSet = null;
        PreparedStatement statement = null;
        try{
            c = ConnectionFactory.getConnection();
            statement = c.prepareStatement(sql);
            statement.setInt(1, idProject);
            resultSet = statement.executeQuery();
            //Enquanto 
            while(resultSet.next()){
                Task task = new Task();
                task.setId(resultSet.getInt("id"));
                task.setProjectId(resultSet.getInt("idProject"));
                task.setName(resultSet.getString("name"));
                task.setDescription(resultSet.getString("description"));
                task.setNotes(resultSet.getString("notes"));
                task.setDeadLine(resultSet.getDate("deadline"));
                task.setCreatedAt(resultSet.getDate("createdAt"));
                task.setUpdatedAt(resultSet.getDate("updatedAt"));
                tasks.add(task);
            }
        }catch(SQLException sqle){
            throw new RuntimeException("Erro ao inserir a tarefa",sqle);
        }finally{
            ConnectionFactory.closeConnection(c, statement);
        }
        
        return tasks;
    }
}
