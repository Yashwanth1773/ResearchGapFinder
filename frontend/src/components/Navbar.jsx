import { Link } from "react-router-dom";

function Navbar() {
  return (
    <nav style={{
      padding: "15px",
      background: "#1e293b",
      color: "white"
    }}>
      <Link to="/" style={{marginRight:"20px", color:"white"}}>Dashboard</Link>

      <Link to="/papers" style={{marginRight:"20px", color:"white"}}>Paper Search</Link>

      <Link to="/gaps" style={{marginRight:"20px", color:"white"}}>Gap Detection</Link>

      <Link to="/recommend" style={{marginRight:"20px", color:"white"}}>Recommendations</Link>

      <Link to="/feasibility" style={{marginRight:"20px", color:"white"}}>Feasibility</Link>

      <Link to="/survey" style={{color:"white"}}>Literature Survey</Link>
    </nav>
  );
}

export default Navbar;