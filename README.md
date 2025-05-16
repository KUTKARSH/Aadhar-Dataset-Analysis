# 🇮🇳 Aadhaar-Dataset-Analysis

A Big Data project to analyze the **Aadhaar enrollment and rejection data** using **MapReduce**.  
This dataset is publicly available and released under the **National Data Sharing and Accessibility Policy (NDSAP)**.

---

## 📌 Overview

The dataset provides a daily snapshot of:

- Total Aadhaar numbers **generated**
- Total **enrollment applications rejected**
- Data aggregated by **state** and **district**
- Based on user information provided at the time of Aadhaar enrollment

Each file is named in the format:
Where `YYYYMMDD` refers to the specific date of the data captured.

---

## 🛠️ Tools & Technologies Used

- **Hadoop MapReduce** – For large-scale data processing  
- **HDFS** – For distributed file storage  
- **Java** – MapReduce logic implementation  
- (Optional) **Pig / Hive** – For further querying and summarization

---

## 🎯 Goals of Analysis

- Identify states or districts with **high rejection rates**
- Monitor **daily Aadhaar generation trends**
- Compare **enrollment vs approval** ratios across regions
- Generate **insights** for governance and administrative planning

---

## 🧩 Dataset Metadata

- **Source**: [UIDAI via NITI Aayog / Planning Commission]  
- **Contributor**: Unique Identification Authority of India (UIDAI)  
- **Published on Data Portal**: February 13, 2014  
- **License**: NDSAP Open Government Data License

---

## 🚀 Getting Started

1. Set up a Hadoop environment (pseudo or cluster mode)
2. Place the dataset files (`UIDAI-ENR-GEOGRAPHY-*.csv`) into HDFS
3. Compile and run the MapReduce job using Hadoop CLI
4. Output results to HDFS or export for visualization

