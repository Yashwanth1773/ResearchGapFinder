function Dashboard() {

  const cards = [
    { title: "Papers", value: 120 },
    { title: "Research Gaps", value: 15 },
    { title: "Confidence Score", value: "92%" },
    { title: "Project Ideas", value: 30 }
  ];

  return (
    <div style={{padding:"20px"}}>

      <h1>ResearchNavigator Dashboard</h1>

      <div style={{
        display:"flex",
        gap:"20px",
        marginTop:"20px"
      }}>
        {cards.map((card,index) => (
          <div
            key={index}
            style={{
              border:"1px solid gray",
              padding:"20px",
              width:"200px",
              borderRadius:"10px"
            }}
          >
            <h3>{card.title}</h3>
            <h2>{card.value}</h2>
          </div>
        ))}
      </div>

    </div>
  );
}
    
export default Dashboard;