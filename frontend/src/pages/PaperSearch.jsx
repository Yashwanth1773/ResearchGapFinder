import { useState } from "react";
import axios from "axios";

function PaperSearch() {

  const [papers, setPapers] = useState([]);

  const loadPapers = async () => {

    const response =
      await axios.get(
        "http://localhost:8080/arxiv/papers"
      );

    setPapers(response.data);
  };

  return (
    <div style={{padding:"20px"}}>

      <h1>Research Papers</h1>

      <button onClick={loadPapers}>
        Load Papers
      </button>

      {papers.map((paper,index)=>(
        <div
          key={index}
          style={{
            border:"1px solid gray",
            marginTop:"15px",
            padding:"15px",
            borderRadius:"10px"
          }}
        >
          <h3>{paper.title}</h3>
          <p>{paper.summary}</p>
        </div>
      ))}

    </div>
  );
}

export default PaperSearch;