
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import database.Database;



public class Promocoes_dao {
	
	//CREATE
	public void save(Destino destino) { 
		
		
		String sql = "INSERT INTO Destinos VALUES (?,?,?,?,?)";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try { 
			conn = Database.createConnection();
			
			pstm = conn.prepareStatement(sql);
			
			pstm.setInt(1, destino.getId_destino());
			pstm.setString(2, destino.getPais());
			pstm.setString(3, destino.getUf());
			pstm.setString(4, destino.getCidade());
			pstm.setInt(5, destino.getPromocao().getId_promocao());
			
			pstm.execute();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally { 
			
			try { 
				if (pstm != null) { 
					pstm.close();
				}
				if (conn != null) { 
					conn.close();
				}
			} catch (Exception e) { 
				e.printStackTrace();
			}
		}
	}
	
	//READ
	public List<Destino> getDestino() { 
		
		
		String sql = "SELECT * FROM destinos";
		
		
		List<Destino> pessoas = new ArrayList<Destino>();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		
		ResultSet rset = null;
		
		try {
			
			conn = Database.createConnection();
			
			
			pstm = conn.prepareStatement(sql);
			
			
			rset = pstm.executeQuery();
			
			while (rset.next()) { 
				System.out.println(rset.getInt(1));
				System.out.println(rset.getString(2));
				System.out.println(rset.getString(3));
				System.out.println(rset.getString(4));
				System.out.println(rset.getInt(5));
				
			}
		} catch (Exception e) { 
			e.printStackTrace();
		} finally { 
			try { 
				if (rset != null) { 
					rset.close();
				}
				if (pstm != null) { 
					pstm.close();
				}
				if (conn != null) { 
					conn.close();
				}
				
			} catch (Exception e) { 
				e.printStackTrace();
			}
		}
		
		return pessoas;
	}

	//UPDATE
	public void update(Destino destino) { 
		
		String sql = "UPDATE destinos SET pais = ?, uf= ?, cidade= ?, promocao=? WHERE id_Destino = ?";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try { 
			conn =Database.createConnection();
			
			pstm = conn.prepareStatement(sql);
			
			pstm.setInt(5, destino.getId_destino());
			pstm.setString(1, destino.getPais());
			pstm.setString(2, destino.getUf());
			pstm.setString(3, destino.getCidade());
			pstm.setInt(4, destino.getPromocao().getId_promocao());
			
			pstm.execute();
			
		} catch (Exception e) { 
			e.printStackTrace();
		} finally { 
			try { 
				if (pstm != null) { 
					pstm.close();
				}
				if (conn != null) { 
					conn.close();
				}
				
			} catch (Exception e) { 
				e.printStackTrace();
			}
		}
	}
	
	//DELETE
	public void deleteById(int id) { 
		
		String sql = "DELETE FROM destinos WHERE id_destino = ?";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try { 
			conn = Database.createConnection();
			pstm = conn.prepareStatement(sql);
			
			pstm.setInt(1, id);
			pstm.execute();
		} catch (Exception e) { 
			e.printStackTrace();
		} finally { 
			try { 
				if (pstm != null) { 
					pstm.close();
				}
				if (conn != null) { 
					conn.close();
				}
				
			} catch (Exception e) { 
				e.printStackTrace();
			}
		}
	}
}
