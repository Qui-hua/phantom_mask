package com.example.demo.data;

import org.json.JSONArray;
import org.json.JSONObject;

public class pharmaciesData {

////pharmacies 資料
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String jsonstring ="[\n"
				+ "  {\n"
				+ "    \"name\": \"Better You\",\n"
				+ "    \"cashBalance\": 777.61,\n"
				+ "    \"openingHours\": \"Mon, Wed 12:56 - 21:58 / Tue 13:06 - 22:42 / Fri - Sat 17:09 - 20:20 / Sun 07:10 - 09:33\",\n"
				+ "    \"masks\": [\n"
				+ "      {\n"
				+ "        \"name\": \"AniMask (blue) (10 per pack)\",\n"
				+ "        \"price\": 33.65\n"
				+ "      }\n"
				+ "    ]\n"
				+ "  },\n"
				+ "  {\n"
				+ "    \"name\": \"Cash Saver Pharmacy\",\n"
				+ "    \"cashBalance\": 596.94,\n"
				+ "    \"openingHours\": \"Mon 11:00 - 14:48 / Tue, Fri 00:05 - 07:20 / Sat - Sun 09:01 - 12:43\",\n"
				+ "    \"masks\": [\n"
				+ "      {\n"
				+ "        \"name\": \"MaskT (black) (10 per pack)\",\n"
				+ "        \"price\": 14.9\n"
				+ "      },\n"
				+ "      {\n"
				+ "        \"name\": \"Free to Roam (black) (3 per pack)\",\n"
				+ "        \"price\": 13.83\n"
				+ "      },\n"
				+ "      {\n"
				+ "        \"name\": \"AniMask (green) (10 per pack)\",\n"
				+ "        \"price\": 49.21\n"
				+ "      },\n"
				+ "      {\n"
				+ "        \"name\": \"Masquerade (blue) (6 per pack)\",\n"
				+ "        \"price\": 16.75\n"
				+ "      }\n"
				+ "    ]\n"
				+ "  },\n"
				+ "  {\n"
				+ "    \"name\": \"PrecisionMed\",\n"
				+ "    \"cashBalance\": 181.84,\n"
				+ "    \"openingHours\": \"Tue 14:10 - 16:25 / Wed 16:57 - 21:46 / Thu 16:30 - 19:40 / Fri 02:55 - 16:49 / Sun 10:59 - 05:33\",\n"
				+ "    \"masks\": [\n"
				+ "      {\n"
				+ "        \"name\": \"Second Smile (blue) (10 per pack)\",\n"
				+ "        \"price\": 39.98\n"
				+ "      },\n"
				+ "      {\n"
				+ "        \"name\": \"Free to Roam (green) (3 per pack)\",\n"
				+ "        \"price\": 8.83\n"
				+ "      },\n"
				+ "      {\n"
				+ "        \"name\": \"AniMask (black) (3 per pack)\",\n"
				+ "        \"price\": 12.81\n"
				+ "      },\n"
				+ "      {\n"
				+ "        \"name\": \"Masquerade (black) (3 per pack)\",\n"
				+ "        \"price\": 8.17\n"
				+ "      },\n"
				+ "      {\n"
				+ "        \"name\": \"MaskT (blue) (3 per pack)\",\n"
				+ "        \"price\": 7.04\n"
				+ "      }\n"
				+ "    ]\n"
				+ "  },\n"
				+ "  {\n"
				+ "    \"name\": \"MedSavvy\",\n"
				+ "    \"cashBalance\": 903.57,\n"
				+ "    \"openingHours\": \"Tue 10:08 - 23:13 / Wed 12:38 - 21:48 / Thu 12:14 - 22:48 / Fri - Sat 15:01 - 21:24 / Sun 00:03 - 07:58\",\n"
				+ "    \"masks\": [\n"
				+ "      {\n"
				+ "        \"name\": \"Masquerade (black) (10 per pack)\",\n"
				+ "        \"price\": 19.54\n"
				+ "      },\n"
				+ "      {\n"
				+ "        \"name\": \"Free to Roam (blue) (10 per pack)\",\n"
				+ "        \"price\": 30.74\n"
				+ "      },\n"
				+ "      {\n"
				+ "        \"name\": \"Free to Roam (black) (10 per pack)\",\n"
				+ "        \"price\": 26.54\n"
				+ "      },\n"
				+ "      {\n"
				+ "        \"name\": \"AniMask (blue) (6 per pack)\",\n"
				+ "        \"price\": 28.72\n"
				+ "      },\n"
				+ "      {\n"
				+ "        \"name\": \"MaskT (black) (3 per pack)\",\n"
				+ "        \"price\": 4.14\n"
				+ "      },\n"
				+ "      {\n"
				+ "        \"name\": \"Second Smile (green) (3 per pack)\",\n"
				+ "        \"price\": 6.55\n"
				+ "      }\n"
				+ "    ]\n"
				+ "  },\n"
				+ "  {\n"
				+ "    \"name\": \"Pill Pack\",\n"
				+ "    \"cashBalance\": 905.44,\n"
				+ "    \"openingHours\": \"Mon 07:14 - 17:06 / Tue 16:47 - 19:25 / Wed 15:30 - 19:00 / Sat 04:35 - 06:35 / Sun 01:39 - 16:59\",\n"
				+ "    \"masks\": [\n"
				+ "      {\n"
				+ "        \"name\": \"Masquerade (black) (3 per pack)\",\n"
				+ "        \"price\": 3.76\n"
				+ "      },\n"
				+ "      {\n"
				+ "        \"name\": \"Free to Roam (blue) (3 per pack)\",\n"
				+ "        \"price\": 7.89\n"
				+ "      },\n"
				+ "      {\n"
				+ "        \"name\": \"MaskT (green) (10 per pack)\",\n"
				+ "        \"price\": 32.57\n"
				+ "      },\n"
				+ "      {\n"
				+ "        \"name\": \"AniMask (green) (10 per pack)\",\n"
				+ "        \"price\": 22.01\n"
				+ "      },\n"
				+ "      {\n"
				+ "        \"name\": \"Masquerade (green) (10 per pack)\",\n"
				+ "        \"price\": 42.27\n"
				+ "      },\n"
				+ "      {\n"
				+ "        \"name\": \"AniMask (black) (6 per pack)\",\n"
				+ "        \"price\": 14.16\n"
				+ "      }\n"
				+ "    ]\n"
				+ "  },\n"
				+ "  {\n"
				+ "    \"name\": \"Heartland Pharmacy\",\n"
				+ "    \"cashBalance\": 858.91,\n"
				+ "    \"openingHours\": \"Mon 13:18 - 17:49 / Tue 05:06 - 17:45 / Wed - Thu 03:25 - 11:25 / Sat 04:10 - 08:03 / Sun 15:07 - 18:50\",\n"
				+ "    \"masks\": [\n"
				+ "      {\n"
				+ "        \"name\": \"MaskT (green) (6 per pack)\",\n"
				+ "        \"price\": 29.91\n"
				+ "      },\n"
				+ "      {\n"
				+ "        \"name\": \"Second Smile (green) (6 per pack)\",\n"
				+ "        \"price\": 11.89\n"
				+ "      },\n"
				+ "      {\n"
				+ "        \"name\": \"MaskT (green) (10 per pack)\",\n"
				+ "        \"price\": 35.06\n"
				+ "      },\n"
				+ "      {\n"
				+ "        \"name\": \"Free to Roam (black) (3 per pack)\",\n"
				+ "        \"price\": 5.31\n"
				+ "      }\n"
				+ "    ]\n"
				+ "  },\n"
				+ "  {\n"
				+ "    \"name\": \"Longhorn Pharmacy\",\n"
				+ "    \"cashBalance\": 323.3,\n"
				+ "    \"openingHours\": \"Mon, Wed 10:53 - 16:49 / Tue 17:41 - 21:42 / Thu 08:25 - 00:30 / Sun 15:53 - 02:05\",\n"
				+ "    \"masks\": [\n"
				+ "      {\n"
				+ "        \"name\": \"AniMask (green) (10 per pack)\",\n"
				+ "        \"price\": 10.83\n"
				+ "      },\n"
				+ "      {\n"
				+ "        \"name\": \"AniMask (black) (3 per pack)\",\n"
				+ "        \"price\": 8.94\n"
				+ "      },\n"
				+ "      {\n"
				+ "        \"name\": \"Masquerade (blue) (6 per pack)\",\n"
				+ "        \"price\": 20.0\n"
				+ "      },\n"
				+ "      {\n"
				+ "        \"name\": \"Masquerade (blue) (10 per pack)\",\n"
				+ "        \"price\": 21.67\n"
				+ "      },\n"
				+ "      {\n"
				+ "        \"name\": \"Second Smile (blue) (3 per pack)\",\n"
				+ "        \"price\": 7.32\n"
				+ "      }\n"
				+ "    ]\n"
				+ "  },\n"
				+ "  {\n"
				+ "    \"name\": \"PharmaMed\",\n"
				+ "    \"cashBalance\": 238.89,\n"
				+ "    \"openingHours\": \"Mon, Sat 03:27 - 09:16 / Tue 14:41 - 19:40 / Wed 04:05 - 16:06 / Thu 09:49 - 17:25 / Fri 08:05 - 19:48\",\n"
				+ "    \"masks\": [\n"
				+ "      {\n"
				+ "        \"name\": \"MaskT (black) (6 per pack)\",\n"
				+ "        \"price\": 13.41\n"
				+ "      }\n"
				+ "    ]\n"
				+ "  },\n"
				+ "  {\n"
				+ "    \"name\": \"Neighbors\",\n"
				+ "    \"cashBalance\": 151.65,\n"
				+ "    \"openingHours\": \"Mon 10:09 - 02:26 / Wed 15:26 - 17:33 / Thu 15:31 - 17:46 / Sat 13:14 - 20:24 / Sun 00:02 - 16:40\",\n"
				+ "    \"masks\": [\n"
				+ "      {\n"
				+ "        \"name\": \"Masquerade (black) (3 per pack)\",\n"
				+ "        \"price\": 10.28\n"
				+ "      },\n"
				+ "      {\n"
				+ "        \"name\": \"Free to Roam (green) (3 per pack)\",\n"
				+ "        \"price\": 14.18\n"
				+ "      },\n"
				+ "      {\n"
				+ "        \"name\": \"MaskT (green) (10 per pack)\",\n"
				+ "        \"price\": 47.83\n"
				+ "      }\n"
				+ "    ]\n"
				+ "  },\n"
				+ "  {\n"
				+ "    \"name\": \"Discount Drugs\",\n"
				+ "    \"cashBalance\": 753.18,\n"
				+ "    \"openingHours\": \"Wed 05:16 - 09:37 / Thu 14:04 - 23:19 / Fri - Sat 00:27 - 04:08 / Sun 03:04 - 06:25\",\n"
				+ "    \"masks\": [\n"
				+ "      {\n"
				+ "        \"name\": \"Free to Roam (blue) (10 per pack)\",\n"
				+ "        \"price\": 38.41\n"
				+ "      },\n"
				+ "      {\n"
				+ "        \"name\": \"MaskT (blue) (6 per pack)\",\n"
				+ "        \"price\": 27.91\n"
				+ "      },\n"
				+ "      {\n"
				+ "        \"name\": \"Free to Roam (black) (6 per pack)\",\n"
				+ "        \"price\": 28.54\n"
				+ "      },\n"
				+ "      {\n"
				+ "        \"name\": \"Masquerade (blue) (6 per pack)\",\n"
				+ "        \"price\": 28.02\n"
				+ "      }\n"
				+ "    ]\n"
				+ "  },\n"
				+ "  {\n"
				+ "    \"name\": \"Medlife\",\n"
				+ "    \"cashBalance\": 467.39,\n"
				+ "    \"openingHours\": \"Wed 16:49 - 20:32 / Thu 15:57 - 09:13 / Fri - Sat 13:36 - 20:51 / Sun 02:42 - 19:44\",\n"
				+ "    \"masks\": [\n"
				+ "      {\n"
				+ "        \"name\": \"Second Smile (black) (3 per pack)\",\n"
				+ "        \"price\": 5.06\n"
				+ "      },\n"
				+ "      {\n"
				+ "        \"name\": \"Second Smile (blue) (3 per pack)\",\n"
				+ "        \"price\": 12.51\n"
				+ "      },\n"
				+ "      {\n"
				+ "        \"name\": \"Free to Roam (black) (3 per pack)\",\n"
				+ "        \"price\": 10.81\n"
				+ "      },\n"
				+ "      {\n"
				+ "        \"name\": \"Second Smile (black) (6 per pack)\",\n"
				+ "        \"price\": 23.73\n"
				+ "      },\n"
				+ "      {\n"
				+ "        \"name\": \"MaskT (black) (10 per pack)\",\n"
				+ "        \"price\": 43.94\n"
				+ "      },\n"
				+ "      {\n"
				+ "        \"name\": \"MaskT (black) (3 per pack)\",\n"
				+ "        \"price\": 10.13\n"
				+ "      }\n"
				+ "    ]\n"
				+ "  },\n"
				+ "  {\n"
				+ "    \"name\": \"Pride Pharmacy\",\n"
				+ "    \"cashBalance\": 896.75,\n"
				+ "    \"openingHours\": \"Mon 07:50 - 14:53 / Thu - Fri 00:53 - 07:57 / Sat 12:20 - 17:45 / Sun 15:50 - 10:49\",\n"
				+ "    \"masks\": [\n"
				+ "      {\n"
				+ "        \"name\": \"Free to Roam (blue) (3 per pack)\",\n"
				+ "        \"price\": 5.61\n"
				+ "      },\n"
				+ "      {\n"
				+ "        \"name\": \"MaskT (black) (10 per pack)\",\n"
				+ "        \"price\": 46.51\n"
				+ "      },\n"
				+ "      {\n"
				+ "        \"name\": \"Second Smile (black) (3 per pack)\",\n"
				+ "        \"price\": 9.59\n"
				+ "      },\n"
				+ "      {\n"
				+ "        \"name\": \"Masquerade (blue) (3 per pack)\",\n"
				+ "        \"price\": 6.26\n"
				+ "      },\n"
				+ "      {\n"
				+ "        \"name\": \"AniMask (blue) (10 per pack)\",\n"
				+ "        \"price\": 11.47\n"
				+ "      }\n"
				+ "    ]\n"
				+ "  },\n"
				+ "  {\n"
				+ "    \"name\": \"Atlas Drugs\",\n"
				+ "    \"cashBalance\": 785.02,\n"
				+ "    \"openingHours\": \"Mon 16:30 - 23:07 / Wed 10:16 - 16:48 / Fri 16:20 - 20:39 / Sat 00:17 - 12:55 / Sun 05:33 - 23:59\",\n"
				+ "    \"masks\": [\n"
				+ "      {\n"
				+ "        \"name\": \"Second Smile (green) (6 per pack)\",\n"
				+ "        \"price\": 6.82\n"
				+ "      },\n"
				+ "      {\n"
				+ "        \"name\": \"MaskT (green) (6 per pack)\",\n"
				+ "        \"price\": 25.73\n"
				+ "      },\n"
				+ "      {\n"
				+ "        \"name\": \"MaskT (black) (6 per pack)\",\n"
				+ "        \"price\": 9.7\n"
				+ "      }\n"
				+ "    ]\n"
				+ "  },\n"
				+ "  {\n"
				+ "    \"name\": \"Thrifty Way Pharmacy\",\n"
				+ "    \"cashBalance\": 220.73,\n"
				+ "    \"openingHours\": \"Mon, Fri 04:02 - 15:08 / Tue 09:57 - 18:23 / Wed 12:10 - 00:10 / Sat 12:21 - 21:32\",\n"
				+ "    \"masks\": [\n"
				+ "      {\n"
				+ "        \"name\": \"AniMask (green) (10 per pack)\",\n"
				+ "        \"price\": 25.42\n"
				+ "      },\n"
				+ "      {\n"
				+ "        \"name\": \"AniMask (blue) (10 per pack)\",\n"
				+ "        \"price\": 34.39\n"
				+ "      },\n"
				+ "      {\n"
				+ "        \"name\": \"Second Smile (black) (3 per pack)\",\n"
				+ "        \"price\": 12.38\n"
				+ "      },\n"
				+ "      {\n"
				+ "        \"name\": \"MaskT (green) (3 per pack)\",\n"
				+ "        \"price\": 11.56\n"
				+ "      },\n"
				+ "      {\n"
				+ "        \"name\": \"AniMask (blue) (6 per pack)\",\n"
				+ "        \"price\": 19.16\n"
				+ "      },\n"
				+ "      {\n"
				+ "        \"name\": \"AniMask (black) (10 per pack)\",\n"
				+ "        \"price\": 36.31\n"
				+ "      },\n"
				+ "      {\n"
				+ "        \"name\": \"Free to Roam (black) (6 per pack)\",\n"
				+ "        \"price\": 20.16\n"
				+ "      },\n"
				+ "      {\n"
				+ "        \"name\": \"AniMask (green) (3 per pack)\",\n"
				+ "        \"price\": 3.23\n"
				+ "      },\n"
				+ "      {\n"
				+ "        \"name\": \"Masquerade (green) (3 per pack)\",\n"
				+ "        \"price\": 5.73\n"
				+ "      }\n"
				+ "    ]\n"
				+ "  },\n"
				+ "  {\n"
				+ "    \"name\": \"Apotheco\",\n"
				+ "    \"cashBalance\": 274.49,\n"
				+ "    \"openingHours\": \"Mon, Sat 10:06 - 14:26 / Tue 08:27 - 22:13 / Wed 08:06 - 16:22 / Thu 12:24 - 19:49 / Sun 15:53 - 05:32\",\n"
				+ "    \"masks\": [\n"
				+ "      {\n"
				+ "        \"name\": \"Masquerade (blue) (10 per pack)\",\n"
				+ "        \"price\": 38.33\n"
				+ "      }\n"
				+ "    ]\n"
				+ "  },\n"
				+ "  {\n"
				+ "    \"name\": \"Drug Blend\",\n"
				+ "    \"cashBalance\": 767.14,\n"
				+ "    \"openingHours\": \"Mon 04:08 - 20:52 / Tue 01:01 - 06:01 / Wed, Sat 11:18 - 20:37 / Thu 16:44 - 23:43 / Sun 04:26 - 14:48\",\n"
				+ "    \"masks\": [\n"
				+ "      {\n"
				+ "        \"name\": \"MaskT (black) (6 per pack)\",\n"
				+ "        \"price\": 12.9\n"
				+ "      },\n"
				+ "      {\n"
				+ "        \"name\": \"AniMask (black) (3 per pack)\",\n"
				+ "        \"price\": 10.65\n"
				+ "      },\n"
				+ "      {\n"
				+ "        \"name\": \"MaskT (black) (3 per pack)\",\n"
				+ "        \"price\": 4.83\n"
				+ "      },\n"
				+ "      {\n"
				+ "        \"name\": \"Free to Roam (green) (3 per pack)\",\n"
				+ "        \"price\": 13.93\n"
				+ "      }\n"
				+ "    ]\n"
				+ "  },\n"
				+ "  {\n"
				+ "    \"name\": \"Wellcare\",\n"
				+ "    \"cashBalance\": 898.06,\n"
				+ "    \"openingHours\": \"Mon 07:59 - 14:55 / Tue, Fri 08:57 - 04:59 / Wed 17:12 - 22:13 / Thu 01:57 - 06:48\",\n"
				+ "    \"masks\": [\n"
				+ "      {\n"
				+ "        \"name\": \"Masquerade (black) (3 per pack)\",\n"
				+ "        \"price\": 7.33\n"
				+ "      },\n"
				+ "      {\n"
				+ "        \"name\": \"Masquerade (green) (6 per pack)\",\n"
				+ "        \"price\": 26.6\n"
				+ "      },\n"
				+ "      {\n"
				+ "        \"name\": \"AniMask (black) (6 per pack)\",\n"
				+ "        \"price\": 6.53\n"
				+ "      }\n"
				+ "    ]\n"
				+ "  },\n"
				+ "  {\n"
				+ "    \"name\": \"Assured Rx\",\n"
				+ "    \"cashBalance\": 181.76,\n"
				+ "    \"openingHours\": \"Mon, Sat 02:30 - 06:43 / Tue - Wed 08:44 - 11:28 / Thu 02:06 - 05:27 / Fri 05:24 - 16:59\",\n"
				+ "    \"masks\": [\n"
				+ "      {\n"
				+ "        \"name\": \"Masquerade (blue) (6 per pack)\",\n"
				+ "        \"price\": 13.55\n"
				+ "      },\n"
				+ "      {\n"
				+ "        \"name\": \"MaskT (black) (10 per pack)\",\n"
				+ "        \"price\": 46.69\n"
				+ "      },\n"
				+ "      {\n"
				+ "        \"name\": \"Free to Roam (blue) (10 per pack)\",\n"
				+ "        \"price\": 15.79\n"
				+ "      },\n"
				+ "      {\n"
				+ "        \"name\": \"Second Smile (green) (6 per pack)\",\n"
				+ "        \"price\": 17.61\n"
				+ "      },\n"
				+ "      {\n"
				+ "        \"name\": \"Free to Roam (black) (10 per pack)\",\n"
				+ "        \"price\": 35.66\n"
				+ "      },\n"
				+ "      {\n"
				+ "        \"name\": \"MaskT (blue) (6 per pack)\",\n"
				+ "        \"price\": 28.27\n"
				+ "      },\n"
				+ "      {\n"
				+ "        \"name\": \"MaskT (green) (10 per pack)\",\n"
				+ "        \"price\": 39.4\n"
				+ "      },\n"
				+ "      {\n"
				+ "        \"name\": \"Free to Roam (blue) (3 per pack)\",\n"
				+ "        \"price\": 14.61\n"
				+ "      },\n"
				+ "      {\n"
				+ "        \"name\": \"Second Smile (black) (3 per pack)\",\n"
				+ "        \"price\": 13.52\n"
				+ "      }\n"
				+ "    ]\n"
				+ "  },\n"
				+ "  {\n"
				+ "    \"name\": \"RxToMe\",\n"
				+ "    \"cashBalance\": 510.91,\n"
				+ "    \"openingHours\": \"Mon 07:12 - 11:46 / Wed 16:24 - 20:15 / Thu 08:59 - 14:07 / Sat - Sun 10:47 - 12:50\",\n"
				+ "    \"masks\": [\n"
				+ "      {\n"
				+ "        \"name\": \"Masquerade (green) (6 per pack)\",\n"
				+ "        \"price\": 12.7\n"
				+ "      }\n"
				+ "    ]\n"
				+ "  },\n"
				+ "  {\n"
				+ "    \"name\": \"DFW Wellness\",\n"
				+ "    \"cashBalance\": 466.36,\n"
				+ "    \"openingHours\": \"Mon - Tue 00:20 - 16:06 / Wed, Sun 10:02 - 13:23 / Thu 10:02 - 09:41 / Fri 16:08 - 21:01\",\n"
				+ "    \"masks\": [\n"
				+ "      {\n"
				+ "        \"name\": \"Second Smile (green) (6 per pack)\",\n"
				+ "        \"price\": 14.9\n"
				+ "      },\n"
				+ "      {\n"
				+ "        \"name\": \"AniMask (blue) (3 per pack)\",\n"
				+ "        \"price\": 9.24\n"
				+ "      }\n"
				+ "    ]\n"
				+ "  }\n"
				+ "]";

		JSONArray JSONArray = new JSONArray(jsonstring);
		/*   藥局 name cashBalance 

		for(int i=0;i<JSONArray.length();i++)
		{
			JSONObject pharmaciesJSONObject = JSONArray.getJSONObject(i);
			System.out.print("('" + pharmaciesJSONObject.get("name") +"' ,"+ pharmaciesJSONObject.get("cashBalance") +"), \n");
			
		}
		*/
		/* 藥局口罩清單
		for(int i=0;i<JSONArray.length();i++)
		{
			int run = i+1;
			JSONArray  mask = new JSONArray(JSONArray.getJSONObject(i).get("masks").toString());
			for(int j=0;j<mask.length();j++)
			{
				JSONObject maskJSONObject = mask.getJSONObject(j);
				System.out.print("( " + run+" ,'"+maskJSONObject.get("name")+"' ,"+maskJSONObject.get("price")+"), \n");
			}
		}
		*/
		
		
		/* 藥局營業時間  由於星期用-表示的為少部分資料，這部分手動處理  */
		for(int i=0;i<JSONArray.length();i++)
		{
			int run = i+1;
			JSONObject pharmaciesJSONObject = JSONArray.getJSONObject(i);
			String openingHours = pharmaciesJSONObject.getString("openingHours");
			String[] array = openingHours.split(" / "); 
			for(int j =0;j< array.length;j++)
			{
				
				if(array[j].contains(","))
				{
					array[j] =array[j].replace(",", "");
					String[] array1 = array[j].split(" "); 
					System.out.print("(" + run +" ,"+ "PARSEDATETIME('"+array1[2]+"','HH:mm')"+" ,"
							  + "PARSEDATETIME('"+array1[4]+"','HH:mm')" +" ,'"
							  + array1[0]+"'), \n") ;
					System.out.print("(" + run +" ,"+ "PARSEDATETIME('"+array1[2]+"','HH:mm')"+" ,"
							  + "PARSEDATETIME('"+array1[4]+"','HH:mm')" +" ,'"
							  + array1[1]+"'), \n") ;
				}
				else
				{
					String[] array1 = array[j].split(" "); 
					if(array1[1].equals("-"))
					{
						System.out.print(run+"  "+array[j]+"\n");
						continue;
					}
					System.out.print("(" + run +" ,"+ "PARSEDATETIME('"+array1[1]+"','HH:mm')"+" ,"
					  + "PARSEDATETIME('"+array1[3]+"','HH:mm')" +" ,'"
					  + array1[0]+"'), \n") ;

				}
			}
			
		}
	}

}
