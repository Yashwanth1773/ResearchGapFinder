import { BrowserRouter, Routes, Route } from "react-router-dom";

import Dashboard from "./pages/Dashboard";
import PaperSearch from "./pages/PaperSearch";
import GapDetection from "./pages/GapDetection";
import Recommendations from "./pages/Recommendations";
import Feasibility from "./pages/Feasibility";
import LiteratureSurvey from "./pages/LiteratureSurvey";
import Navbar from "./components/Navbar";
function App() {
  return (
    <BrowserRouter>
     <Navbar />
      <Routes>
        <Route path="/" element={<Dashboard />} />
        <Route path="/papers" element={<PaperSearch />} />
        <Route path="/gaps" element={<GapDetection />} />
        <Route path="/recommend" element={<Recommendations />} />
        <Route path="/feasibility" element={<Feasibility />} />
        <Route path="/survey" element={<LiteratureSurvey />} />
      </Routes>
    </BrowserRouter>
  );
}

export default App;