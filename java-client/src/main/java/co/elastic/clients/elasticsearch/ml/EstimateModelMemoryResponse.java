/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.ml;

import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ml.estimate_model_memory.Response
public final class EstimateModelMemoryResponse implements ToJsonp {
	private final JsonValue modelMemoryEstimate;

	// ---------------------------------------------------------------------------------------------

	protected EstimateModelMemoryResponse(Builder builder) {

		this.modelMemoryEstimate = Objects.requireNonNull(builder.modelMemoryEstimate, "model_memory_estimate");

	}

	/**
	 * API name: {@code model_memory_estimate}
	 */
	public JsonValue modelMemoryEstimate() {
		return this.modelMemoryEstimate;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("model_memory_estimate");
		generator.write(this.modelMemoryEstimate);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link EstimateModelMemoryResponse}.
	 */
	public static class Builder implements ObjectBuilder<EstimateModelMemoryResponse> {
		private JsonValue modelMemoryEstimate;

		/**
		 * API name: {@code model_memory_estimate}
		 */
		public Builder modelMemoryEstimate(JsonValue value) {
			this.modelMemoryEstimate = value;
			return this;
		}

		/**
		 * Builds a {@link EstimateModelMemoryResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public EstimateModelMemoryResponse build() {

			return new EstimateModelMemoryResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for EstimateModelMemoryResponse
	 */
	public static final JsonpValueParser<EstimateModelMemoryResponse> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, EstimateModelMemoryResponse::setupEstimateModelMemoryResponseParser);

	protected static void setupEstimateModelMemoryResponseParser(
			DelegatingJsonpValueParser<EstimateModelMemoryResponse.Builder> op) {

		op.add(Builder::modelMemoryEstimate, JsonpValueParser.jsonValueParser(), "model_memory_estimate");

	}

}