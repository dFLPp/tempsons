package services;
import com.fasterxml.jackson.databind.ObjectMapper;

import dto.response.SpaceListReponse.SpaceListReponse;
import jakarta.enterprise.context.ApplicationScoped;
@ApplicationScoped
public class SpaceService {

    public void teste(){
        String json = "{\n" +
        "  \"total_count\": 2,\n" +
        "  \"limit\": 10,\n" +
        "  \"first\": {\n" +
        "    \"href\": \"https://example.com/spaces?page=1\"\n" +
        "  },\n" +
        "  \"next\": {\n" +
        "    \"href\": \"https://example.com/spaces?page=2\"\n" +
        "  },\n" +
        "  \"resources\": [\n" +
        "   {\n" +
        "  \"metadata\": {\n" +
        "    \"id\": \"123\",\n" +
        "    \"url\": \"https://example.com/space\",\n" +
        "    \"creator_id\": \"user123\",\n" +
        "    \"created_at\": \"2022-01-24T12:34:56Z\",\n" +
        "    \"updated_at\": \"2022-01-25T09:45:30Z\"\n" +
        "  },\n" +
        "  \"entity\": {\n" +
        "    \"name\": \"MySpace\",\n" +
        "    \"scope\": {\n" +
        "      \"bss_account_id\": \"account123\"\n" +
        "    },\n" +
        "    \"status\": {\n" +
        "      \"state\": \"active\",\n" +
        "      \"failure\": {\n" +
        "        \"trace\": \"error_trace\",\n" +
        "        \"errors\": [\n" +
        "          {\n" +
        "            \"code\": \"500\",\n" +
        "            \"message\": \"Internal Server Error\",\n" +
        "            \"more_info\": \"https://example.com/errors/500\",\n" +
        "            \"parameters\": [\"param1\", \"param2\"]\n" +
        "          }\n" +
        "        ]\n" +
        "      }\n" +
        "    },\n" +
        "    \"stage\": {\n" +
        "      \"production\": true,\n" +
        "      \"name\": \"Development\"\n" +
        "    },\n" +
        "    \"type\": \"cpd\",\n" +
        "    \"description\": \"A sample space\",\n" +
        "    \"storage\": {\n" +
        "      \"type\": \"bmcos_object_storage\",\n" +
        "      \"properties\": {\n" +
        "        \"resource_crn\": \"sample_resource_crn\",\n" +
        "        \"guid\": \"sample_guid\",\n" +
        "        \"bucket_name\": \"sample_bucket\",\n" +
        "        \"bucket_region\": \"us-east-1\",\n" +
        "        \"endpoint_url\": \"https://example.com/storage\",\n" +
        "        \"credentials\": {\n" +
        "          \"viewer\": {\n" +
        "            \"api_key\": \"viewer_api_key\",\n" +
        "            \"service_id\": \"viewer_service_id\",\n" +
        "            \"access_key_id\": \"viewer_access_key\",\n" +
        "            \"secret_access_key\": \"viewer_secret_access_key\",\n" +
        "            \"resource_key_crn\": \"viewer_resource_key_crn\"\n" +
        "          },\n" +
        "          \"editor\": {\n" +
        "            \"api_key\": \"editor_api_key\",\n" +
        "            \"service_id\": \"editor_service_id\",\n" +
        "            \"access_key_id\": \"editor_access_key\",\n" +
        "            \"secret_access_key\": \"editor_secret_access_key\",\n" +
        "            \"resource_key_crn\": \"editor_resource_key_crn\"\n" +
        "          },\n" +
        "          \"admin\": {\n" +
        "            \"api_key\": \"admin_api_key\",\n" +
        "            \"service_id\": \"admin_service_id\",\n" +
        "            \"access_key_id\": \"admin_access_key\",\n" +
        "            \"secret_access_key\": \"admin_secret_access_key\"\n" +
        "          }\n" +
        "        },\n" +
        "        \"key_protect\": true\n" +
        "      }\n" +
        "    },\n" +
        "    \"compute\": [\n" +
        "      {\n" +
        "        \"name\": \"ComputeInstance1\",\n" +
        "        \"crn\": \"compute_crn_1\",\n" +
        "        \"guid\": \"compute_guid_1\",\n" +
        "        \"type\": \"machine_learning\"\n" +
        "      },\n" +
        "      {\n" +
        "        \"name\": \"ComputeInstance2\",\n" +
        "        \"crn\": \"compute_crn_2\",\n" +
        "        \"guid\": \"compute_guid_2\",\n" +
        "        \"type\": \"machine_learning\"\n" +
        "      }\n" +
        "    ],\n" +
        "    \"members\": [\n" +
        "      {\n" +
        "        \"role\": \"admin\",\n" +
        "        \"id\": \"user123\",\n" +
        "        \"state\": \"active\",\n" +
        "        \"type\": \"user\"\n" +
        "      },\n" +
        "      {\n" +
        "        \"role\": \"viewer\",\n" +
        "        \"id\": \"user456\",\n" +
        "        \"state\": \"pending\",\n" +
        "        \"type\": \"user\"\n" +
        "      }\n" +
        "    ],\n" +
        "    \"tags\": [\"tag1\", \"tag2\"],\n" +
        "    \"generator\": \"sample_generator\"\n" +
        "  }\n" +
        "},\n" +
        "    {\n" +
        "      \"metadata\": {\n" +
        "        \"id\": null,\n" +
        "        \"url\": null,\n" +
        "        \"creator_id\": \"user456\",\n" +
        "        \"created_at\": null,\n" +
        "        \"updated_at\": null\n" +
        "      },\n" +
        "      \"entity\": {\n" +
        "        \"name\": \"MySpace2\",\n" +
        "        \"scope\": {\n" +
        "          \"bss_account_id\": null\n" +
        "        },\n" +
        "        \"status\": {\n" +
        "          \"state\": null,\n" +
        "          \"failure\": null\n" +
        "        },\n" +
        "        \"stage\": null,\n" +
        "        \"type\": \"wca\",\n" +
        "        \"description\": \"A sample space 2\",\n" +
        "        \"storage\": {\n" +
        "          \"type\": null,\n" +
        "          \"properties\": {\n" +
        "            \"resource_crn\": null,\n" +
        "            \"guid\": null,\n" +
        "            \"bucket_name\": null,\n" +
        "            \"bucket_region\": null,\n" +
        "            \"endpoint_url\": null,\n" +
        "            \"credentials\": {\n" +
        "              \"viewer\": null,\n" +
        "              \"editor\": null,\n" +
        "              \"admin\": null\n" +
        "            },\n" +
        "            \"key_protect\": null\n" +
        "          }\n" +
        "        },\n" +
        "        \"compute\": [],\n" +
        "        \"members\": [],\n" +
        "        \"tags\": [],\n" +
        "        \"generator\": \"sample_generator\"\n" +
        "      }\n" +
        "    }\n" +
        "  ]\n" +
        "}";


    
        try {
            ObjectMapper mapper = new ObjectMapper();
            SpaceListReponse s = mapper.readValue(json, SpaceListReponse.class);
            System.out.println(s.toString());

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("caiu no catch");
        }
    }
    
}
