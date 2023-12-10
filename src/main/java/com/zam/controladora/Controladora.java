/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zam.controladora;

import com.zam.conexion.Conexion;
import com.zam.logica.Artista;
import com.zam.logica.Disquera;
import com.zam.logica.Genero;
import com.zam.logica.Remix;
import com.zam.logica.Track;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Controladora {
    
    public boolean registrarTrack(Track track) {
        boolean registro = false;
        PreparedStatement ps = null;
        String codSQL = "insert into track (idDisquera, idGenero, nombre, fecha_lanzamiento, bpm, duracion, escala) values (?,?,?,?,?,?,?)";
        try {
            ps = Conexion.getConexion().prepareStatement(codSQL);
            java.sql.Date fecha = new java.sql.Date(track.getFecha_lanzamiento().getTime());
            ps.setInt(1, track.getDisquera().getIdDisquera());
            ps.setInt(2, track.getGenero().getIdGenero());
            ps.setString(3, track.getNombre_track());
            ps.setDate(4, fecha);
            ps.setString(5, track.getBpm());
            ps.setString(6, track.getDuracion());
            ps.setString(7, track.getEscala());
            int valor = ps.executeUpdate();
            if (valor != 0) {
                registro = true;
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("Error: " + ex.getMessage());
                }
            }
        }
        return registro;
    }

    public boolean registrarArtista(Artista artista) {
        boolean registro = false;
        PreparedStatement ps = null;
        String codSQL = "insert into artista (nombre, info) values (?,?)";
        try {
            ps = Conexion.getConexion().prepareStatement(codSQL);
            ps.setString(1, artista.getNombre());
            ps.setString(2, artista.getInfo());
            int valor = ps.executeUpdate();
            if (valor != 0) {
                registro = true;
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("Error: " + ex.getMessage());
                }
            }
        }
        return registro;
    }
    
    public boolean registrarDisquera(Disquera disquera) {
        boolean registro = false;
        PreparedStatement ps = null;
        String codSQL = "insert into disquera (nombre, info) values (?,?)";
        try {
            ps = Conexion.getConexion().prepareStatement(codSQL);
            ps.setString(1, disquera.getNombre());
            ps.setString(2, disquera.getInfo());
            int valor = ps.executeUpdate();
            if (valor != 0) {
                registro = true;
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("Error: " + ex.getMessage());
                }
            }
        }
        return registro;
    }
    
    public boolean registrarGenero(Genero genero) {
        boolean registro = false;
        PreparedStatement ps = null;
        String codSQL = "insert into genero (nombre, info) values (?,?)";
        try {
            ps = Conexion.getConexion().prepareStatement(codSQL);
            ps.setString(1, genero.getNombre());
            ps.setString(2, genero.getInfo());
            int valor = ps.executeUpdate();
            if (valor != 0) {
                registro = true;
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("Error: " + ex.getMessage());
                }
            }
        }
        return registro;
    }
    
        public boolean registrarRemix(Remix remix) {
        boolean registro = false;
        PreparedStatement ps = null;
        String codSQL = "insert into remix (idTrack, idGenero, idDisquera, nombre, fecha_lanzamiento, bpm, duracion, escala) values (?,?,?,?,?,?,?,?)";
        try {
            ps = Conexion.getConexion().prepareStatement(codSQL);
            java.sql.Date fecha = new java.sql.Date(remix.getFecha_lanzamiento().getTime());
            ps.setInt(1, remix.getTrack().getIdTrack());
            ps.setInt(2, remix.getGenero().getIdGenero());
            ps.setInt(3, remix.getDisquera().getIdDisquera());
            ps.setString(4, remix.getNombre_remix());
            ps.setDate(5, fecha);
            ps.setString(6, remix.getBpm());
            ps.setString(7, remix.getDuracion());
            ps.setString(8, remix.getEscala());
            int valor = ps.executeUpdate();
            if (valor != 0) {
                registro = true;
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("Error: " + ex.getMessage());
                }
            }
        }
        return registro;
    }
    
    public boolean registrarArt_Track(Artista artista, Track track) {
        boolean registro = false;
        PreparedStatement ps = null;
        String codSQL = "insert into artista_track (idArtista, idTrack) values (?,?)";
        try {
            ps = Conexion.getConexion().prepareStatement(codSQL);
            ps.setInt(1, artista.getIdArtista());
            ps.setInt(2, track.getIdTrack());
            int valor = ps.executeUpdate();
            if (valor != 0) {
                registro = true;
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("Error: " + ex.getMessage());
                }
            }
        }
        return registro;
    }
    
    public boolean registrarArt_Remix(Artista artista, Remix remix) {
        boolean registro = false;
        PreparedStatement ps = null;
        String codSQL = "insert into artista_remix (idArtista, idRemix) values (?,?)";
        try {
            ps = Conexion.getConexion().prepareStatement(codSQL);
            ps.setInt(1, artista.getIdArtista());
            ps.setInt(2, remix.getIdRemix());
            int valor = ps.executeUpdate();
            if (valor != 0) {
                registro = true;
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("Error: " + ex.getMessage());
                }
            }
        }
        return registro;
    }
    
    public List<Artista> listarArtista() {
        List<Artista> lista = new ArrayList<>();
        Artista artista;
        ResultSet rs = null;
        PreparedStatement ps;
        String codSQL = "select * from artista";
        try {
            ps = Conexion.getConexion().prepareStatement(codSQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                artista = new Artista(rs.getInt(1), rs.getString(2), rs.getString(3));
                lista.add(artista);
            }
            ps.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if ( rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    System.out.println("Error: " + ex.getMessage());
                }
            }
        }
        return lista;
    }
    
    public List<Genero> listarGenero() {
        List<Genero> lista = new ArrayList<>();
        Genero genero;
        ResultSet rs = null;
        PreparedStatement ps;
        Connection cn = Conexion.getConexion();
        String codSQL = "select * from genero";
        try {
            ps = cn.prepareStatement(codSQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                genero = new Genero(rs.getInt(1), rs.getString(2), rs.getString(3));
                lista.add(genero);
            }
            cn.close();
            ps.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if ( rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    System.out.println("Error: " + ex.getMessage());
                }
            }
        }
        return lista;
    }
    
    public List<Disquera> listarDisquera() {
        List<Disquera> lista = new ArrayList<>();
        Disquera disquera;
        ResultSet rs = null;
        PreparedStatement ps;
        String codSQL = "select * from disquera";
        try {
            ps = Conexion.getConexion().prepareStatement(codSQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                disquera = new Disquera(rs.getInt(1), rs.getString(2), rs.getString(3));
                lista.add(disquera);
            }
            ps.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if ( rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    System.out.println("Error: " + ex.getMessage());
                }
            }
        }
        return lista;
    }
    
    public List<Track> listarTrack() {
        List<Track> lista = new ArrayList<>();
        Track track;
        ResultSet rs = null;
        PreparedStatement ps;
        Connection cn = Conexion.getConexion();
        String codSQL = "select * from track";
        try {
            ps = cn.prepareStatement(codSQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                Disquera disquera = this.obtenerDisquera(rs.getInt(2));
                Genero genero = this.obtenerGenero(rs.getInt(3));
                track = new Track (rs.getInt(1), disquera, genero, rs.getString(4), 
                        rs.getDate(5), rs.getString(6), rs.getString(7), rs.getString(8),
                        rs.getString(9));
                lista.add(track);
            }
            cn.close();
            ps.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if ( rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    System.out.println("Error: " + ex.getMessage());
                }
            }
        }
        return lista;
    }
    
    public Disquera obtenerDisquera(String nombre) {
        Disquera disquera = null;
        ResultSet rs = null;
        PreparedStatement ps;
        String codSQL = "select * from disquera where nombre = ?";
        try {
            ps = Conexion.getConexion().prepareStatement(codSQL);
            ps.setString(1, nombre);
            rs = ps.executeQuery();
            while (rs.next()) {
                disquera = new Disquera(rs.getInt(1), rs.getString(2), rs.getString(3));
            }
            ps.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if ( rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    System.out.println("Error: " + ex.getMessage());
                }
            }
        }
        return disquera;
    }
    
    public Disquera obtenerDisquera(int id) {
        Disquera disquera = null;
        ResultSet rs = null;
        PreparedStatement ps;
        String codSQL = "select * from disquera where idDisquera = ?";
        try {
            ps = Conexion.getConexion().prepareStatement(codSQL);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                disquera = new Disquera(rs.getInt(1), rs.getString(2), rs.getString(3));
            }
            ps.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if ( rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    System.out.println("Error: " + ex.getMessage());
                }
            }
        }
        return disquera;
    }
    
    public Genero obtenerGenero(String nombre) {
        Genero genero = null;
        ResultSet rs = null;
        PreparedStatement ps;
        String codSQL = "select * from genero where nombre = ?";
        try {
            ps = Conexion.getConexion().prepareStatement(codSQL);
            ps.setString(1, nombre);
            rs = ps.executeQuery();
            while (rs.next()) {
                genero = new Genero(rs.getInt(1), rs.getString(2), rs.getString(3));
            }
            ps.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if ( rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    System.out.println("Error: " + ex.getMessage());
                }
            }
        }
        return genero;
    }
    
    public Genero obtenerGenero(int id) {
        Genero genero = null;
        ResultSet rs = null;
        PreparedStatement ps;
        String codSQL = "select * from genero where idGenero = ?";
        try {
            ps = Conexion.getConexion().prepareStatement(codSQL);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                genero = new Genero(rs.getInt(1), rs.getString(2), rs.getString(3));
            }
            ps.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if ( rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    System.out.println("Error: " + ex.getMessage());
                }
            }
        }
        return genero;
    }
    
    public Artista obtenerArtista(String nombre) {
        Artista artista = null;
        ResultSet rs = null;
        PreparedStatement ps;
        String codSQL = "select * from artista where nombre = ?";
        try {
            ps = Conexion.getConexion().prepareStatement(codSQL);
            ps.setString(1, nombre);
            rs = ps.executeQuery();
            while (rs.next()) {
                artista = new Artista(rs.getInt(1), rs.getString(2), rs.getString(3));
            }
            ps.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if ( rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    System.out.println("Error: " + ex.getMessage());
                }
            }
        }
        return artista;
    }
    
    public Artista obtenerArtista(int id) {
        Artista artista = null;
        ResultSet rs = null;
        PreparedStatement ps;
        String codSQL = "select * from artista where idArtista = ?";
        try {
            ps = Conexion.getConexion().prepareStatement(codSQL);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                artista = new Artista(rs.getInt(1), rs.getString(2), rs.getString(3));
            }
            ps.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if ( rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    System.out.println("Error: " + ex.getMessage());
                }
            }
        }
        return artista;
    }
    
    public int obtenerArtistaId(int id) {
        ResultSet rs = null;
        PreparedStatement ps;
        String codSQL = "select idArtista from artista_track where idTrack = ?";
        int valor = 0;
        try {
            ps = Conexion.getConexion().prepareStatement(codSQL);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            rs.next();
            valor = rs.getInt(1);
            ps.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if ( rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    System.out.println("Error: " + ex.getMessage());
                }
            }
        }
        return valor;
    }
    
    public Track obtenerTrack(String nombre) {
        Track track = null;
        ResultSet rs = null;
        PreparedStatement ps;
        String codSQL = "select * from track where nombre = ?";
        try {
            ps = Conexion.getConexion().prepareStatement(codSQL);
            ps.setString(1, nombre);
            rs = ps.executeQuery();
            while (rs.next()) {
                Disquera disquera = this.obtenerDisquera(rs.getInt(2));
                Genero genero = this.obtenerGenero(rs.getInt(3));
                track = new Track (rs.getInt(1), disquera, genero, rs.getString(4), rs.getDate(5),
                rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9));
            }
            ps.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if ( rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    System.out.println("Error: " + ex.getMessage());
                }
            }
        }
        return track;
    }
    
    public Track obtenerTrack(int id) {
        Track track = null;
        ResultSet rs = null;
        PreparedStatement ps;
        String codSQL = "select * from track where idTrack = ?";
        try {
            ps = Conexion.getConexion().prepareStatement(codSQL);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                Disquera disquera = this.obtenerDisquera(rs.getInt(2));
                Genero genero = this.obtenerGenero(rs.getInt(3));
                track = new Track (rs.getInt(1), disquera, genero, rs.getString(4), rs.getDate(5),
                rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9));
            }
            ps.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if ( rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    System.out.println("Error: " + ex.getMessage());
                }
            }
        }
        return track;
    }
    
    public Remix obtenerRemix(String nombre) {
        Remix remix = null;
        ResultSet rs = null;
        PreparedStatement ps;
        String codSQL = "select * from remix where nombre = ?";
        try {
            ps = Conexion.getConexion().prepareStatement(codSQL);
            ps.setString(1, nombre);
            rs = ps.executeQuery();
            while (rs.next()) {
                Track track = this.obtenerTrack(rs.getInt(2));
                Genero genero = this.obtenerGenero(rs.getInt(3));
                Disquera disquera = this.obtenerDisquera(rs.getInt(2));
                remix = new Remix (rs.getInt(1), track, genero, disquera, rs.getString(5),
                rs.getDate(6), rs.getString(7), rs.getString(8), 
                        rs.getString(9));
            }
            ps.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if ( rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    System.out.println("Error: " + ex.getMessage());
                }
            }
        }
        return remix;
    }
       
}
